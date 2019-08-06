package khoapham.ptp.phamtanphat.recyclerviewcoban02072019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<String> mangten = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);

        mangten = new ArrayList<>();

        mangten.add("Phat");
        mangten.add("Phat1");
        mangten.add("Phat2");
        mangten.add("Phat3");
        mangten.add("Phat4");
    }
}
