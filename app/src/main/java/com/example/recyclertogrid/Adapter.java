package com.example.recyclertogrid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    List<String> descriptions;
    List<Integer> products;


    List<Integer> update_price;

    Context context;


    public Adapter(List<String> descriptions, List<Integer> products, Context context) {
        this.descriptions = descriptions;
        this.products = products;

        this.context = context;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.sample_grid_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {


       holder.imv.setImageResource(products.get(position));
       holder.des.setText(descriptions.get(position));




    }

    @Override
    public int getItemCount() {
        return descriptions.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{

        private ImageView imv;
        private TextView des,update_price;
        private View v;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imv = itemView.findViewById(R.id.selling_image);
            des = itemView.findViewById(R.id.des_products);







            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(),"Clicked"+ getAdapterPosition(), Toast.LENGTH_SHORT).show();
                }
            });

        }
    }
}

