package com.example.assignmen2v2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private Button viewOrderBtn;
    public static ArrayList<OrderItem> orderItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        orderItems = new ArrayList<>();
        recyclerView = findViewById(R.id.rv1);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //make the adaptor for food
        FoodAdaptor foodAdaptor = new FoodAdaptor();
        foodAdaptor.setData(FoodDatabase.getAllFood());
        recyclerView.setAdapter(foodAdaptor);

        viewOrderBtn = findViewById(R.id.viewOrder);
        viewOrderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOrderActivity();
            }
        });


    }

    public void openOrderActivity() {
        Intent intent = new Intent (this, OrderActivity.class);
        startActivity(intent);
    }

}
