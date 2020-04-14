package com.doddypratama.fcbarcelona;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];
    int images[] = {R.drawable.stegen, R.drawable.neto, R.drawable.alba, R.drawable.firpo,
    R.drawable.roberto, R.drawable.semedo, R.drawable.lenglet, R.drawable.pique, R.drawable.umtiti,
    R.drawable.busquets, R.drawable.de_jong, R.drawable.arthur, R.drawable.vidal, R.drawable.rakitic,
    R.drawable.messi, R.drawable.suarez, R.drawable.griezmann, R.drawable.dembele, R.drawable.braithwaite};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.player_name);
        s2 = getResources().getStringArray(R.array.position);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
