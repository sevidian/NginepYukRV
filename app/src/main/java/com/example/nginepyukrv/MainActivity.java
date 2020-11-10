package com.example.nginepyukrv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView NginepYukRecyclerView;

    String s1[], s2[];
    int images [] = {R.drawable.pemesanan_hotel, R.drawable.pemesanan_hotel, R.drawable.pemesanan_hotel, R.drawable.pemesanan_hotel,
            R.drawable.pemesanan_hotel};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NginepYukRecyclerView = findViewById(R.id.NginepYukRecyclerView);

        s1 = getResources().getStringArray(R.array.Menu_NginepYuk);
        s2 = getResources().getStringArray(R.array.Menu_Description);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        NginepYukRecyclerView.setAdapter(myAdapter);
        NginepYukRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}