package khoapham.ptp.phamtanphat.recyclerviewcoban02072019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Sinhvien> mangsinhvien = new ArrayList<>();
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);

        // su dung class vo danh cho viec them du lieu cho mang object
        mangsinhvien.add(new Sinhvien("Nguyen Van A"));
        mangsinhvien.add(new Sinhvien("Nguyen Van B"));
        mangsinhvien.add(new Sinhvien("Nguyen Van C"));
        mangsinhvien.add(new Sinhvien("Nguyen Van D"));
        mangsinhvien.add(new Sinhvien("Nguyen Van E"));

        adapter = new Adapter(mangsinhvien);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.setAdapter(adapter);
    }
}
