package khoapham.ptp.phamtanphat.recyclerviewcoban02072019;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.Holder>{

    onListenAdapter onListenAdapter;

    ArrayList<Sinhvien> mangsinhvien;
    public Adapter(ArrayList<Sinhvien> mangsinhvien , onListenAdapter onListenAdapter) {
        this.mangsinhvien = mangsinhvien;
        this.onListenAdapter = onListenAdapter;
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
        holder.txtTen.setText(mangsinhvien.get(position).getTen());

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
        public Holder(@NonNull final View itemView) {
            super(itemView);
            txtTen = itemView.findViewById(R.id.textviewTen);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onListenAdapter.onClick(v,getPosition());
                }
            });
            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    onListenAdapter.onLongClick(v , getPosition());
                    return true;
                }
            });
        }

    }
}
