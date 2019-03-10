package com.test.asus.gdwiki.viewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.test.asus.gdwiki.adapterer.adapter;
import com.test.asus.gdwiki.presenterer.presenter;
import com.test.asus.gdwiki.modeler.model;
import com.test.asus.gdwiki.R;
import java.util.ArrayList;
import java.util.List;


public class Main extends AppCompatActivity implements view{
    RecyclerView recyclerView,recyclerView1,recyclerView2;
    adapter adapterlar;
    presenter presenterlar;
    List<model> filmModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recview);
        recyclerView1 = findViewById(R.id.recview1);
        recyclerView2 = findViewById(R.id.recview2);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        adapterlar = new adapter(this,filmModels);
        recyclerView.setAdapter(adapterlar);
        presenterlar = new presenter(this,this);
        presenterlar.setData();

        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        adapterlar = new adapter(this,filmModels);
        recyclerView1.setAdapter(adapterlar);
        presenterlar = new presenter(this,this);
        presenterlar.setData();

        recyclerView2.setLayoutManager(new GridLayoutManager(Main.this, 2));
        adapterlar = new adapter(this,filmModels);
        recyclerView2.setAdapter(adapterlar);
        presenterlar = new presenter(this,this);
        presenterlar.setData();
    }

    @Override
    public void onSucsess(List<model> filmModels) {
        this.filmModels.clear();
        this.filmModels.addAll(filmModels);
        this.adapterlar.notifyDataSetChanged();
    }

}
