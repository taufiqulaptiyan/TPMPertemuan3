package daisy.recyclerintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<PahlawanModel> pahlawanModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.rv_pahlawan1);
        recyclerView.setHasFixedSize(true);
        pahlawanModels.addAll(PahlawanData.getListData());
        showRecylerList();
    }
    private void showRecylerList(){
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        PahlawanAdapter pahlawanAdapter=new PahlawanAdapter(this);
        pahlawanAdapter.setPahlawanModels(pahlawanModels);
        recyclerView.setAdapter(pahlawanAdapter);
    }
}
