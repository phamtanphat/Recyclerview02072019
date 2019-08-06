package khoapham.ptp.phamtanphat.recyclerviewcoban02072019;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.Holder>{

    ArrayList<Sinhvien> mangsinhvien;

    public Adapter(ArrayList<Sinhvien> mangsinhvien) {
        this.mangsinhvien = mangsinhvien;
    }

    //1 : Tao ra viewholder
    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_ten,null);
        return new Holder(view);
    }

    //3 : Gan du lieu tu viewholder
    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        if (mangsinhvien.size() <= 0 || mangsinhvien == null ){
            return 0;
        }
        return mangsinhvien.size();
    }


    //2 : anh xa view trong lop viewholder
    //Class quản lý những view sẽ tương tác lại
    class Holder extends RecyclerView.ViewHolder{
        TextView txtTen;
        public Holder(@NonNull View itemView) {
            super(itemView);
            txtTen = itemView.findViewById(R.id.textviewTen);
        }
    }
}
