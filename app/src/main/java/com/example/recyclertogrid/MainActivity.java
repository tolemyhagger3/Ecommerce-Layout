package com.example.recyclertogrid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> descriptions;
    List<Integer> products;



    RecyclerView rcv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rcv = (RecyclerView) findViewById(R.id.recycler);
        descriptions = new ArrayList<>();
        products = new ArrayList<>();



        products.add(R.drawable.ic_camper_van);
        products.add(R.drawable.ic_placeholder);
        products.add(R.drawable.ic_store);
        products.add(R.drawable.ic_truck);
        products.add(R.drawable.ic_launcher_background);

        descriptions.add("Its a high generation truck.By this truck you can to the next place and this canbe loaded of full tank oils so that there is not creating an issue when you ride.");
        descriptions.add("Its a high yo.");
        descriptions.add("Its a yaaaaa sigh.");
        descriptions.add("Its a high generation popppps.");
        descriptions.add("oppppppssssss.");






        Adapter adapter = new Adapter(descriptions,products,this);

        //for
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2, GridLayoutManager.VERTICAL,false);
        rcv.setLayoutManager(gridLayoutManager);
        rcv.setAdapter(adapter);

    }
}