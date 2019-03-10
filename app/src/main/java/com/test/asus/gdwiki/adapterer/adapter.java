package com.test.asus.gdwiki.adapterer;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.test.asus.gdwiki.modeler.model;
import com.test.asus.gdwiki.viewer.detail;
import com.test.asus.gdwiki.R;
import java.util.ArrayList;
import java.util.List;

public class adapter  extends RecyclerView.Adapter<adapter.ViewHolder>  {

    Context context;
    List<model> filmModels = new ArrayList<>();

    public adapter(Context context, List<model> animeModels) {
        this.context = context;
        this.filmModels = animeModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_list, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.tvName.setText(filmModels.get(i).getName());
        viewHolder.imageView.setImageResource(filmModels.get(i).getGambar());
        viewHolder.overview.setText(filmModels.get(i).getOverview());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // ketika recycler di click
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, detail.class);
                intent.putExtra("name", filmModels.get(i).getName());
                intent.putExtra("gambar", filmModels.get(i).getGambar());
                intent.putExtra("overview", filmModels.get(i).getOverview());
                context.startActivity(intent);
                Toast.makeText(context, filmModels.get(i).getName(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return filmModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        ImageView imageView;
        TextView overview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.nama);
            imageView = itemView.findViewById(R.id.judul);
            overview = itemView.findViewById(R.id.nama2);
        }

    }


}
