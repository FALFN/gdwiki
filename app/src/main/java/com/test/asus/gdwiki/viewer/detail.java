package com.test.asus.gdwiki.viewer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import com.test.asus.gdwiki.R;
import android.widget.TextView;

public class detail extends AppCompatActivity{
    TextView tvName,tvOverview;
    ImageView ivFilm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        tvName = findViewById(R.id.nama);
        tvOverview = findViewById(R.id.nama2);
        ivFilm = findViewById(R.id.judul);

        String nama = getIntent().getStringExtra("nama");
        String overview = getIntent().getStringExtra("overview");
        int gambar = getIntent().getIntExtra("gambar",0);

        tvName.setText(nama);
        tvOverview.setText(overview);
        ivFilm.setImageResource(gambar);
    }

}
