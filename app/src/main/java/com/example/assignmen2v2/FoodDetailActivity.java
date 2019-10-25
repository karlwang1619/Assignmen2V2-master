package com.example.assignmen2v2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FoodDetailActivity extends AppCompatActivity {


    private ImageView foodPhotoIV;
    private TextView foodNameTV;
    private TextView foodDescTV;
    private TextView foodPriceTV;
    private TextView quantityTV;
    int originalQuantity = 1;
    private Button orderFoodBtn;

    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_food_detail);

        Intent intent = getIntent();

        int foodID = intent.getIntExtra("FoodID", 0);
        Food food = FoodDatabase.getFoodByID(foodID);

        foodNameTV = findViewById(R.id.foodName);
        foodDescTV = findViewById(R.id.foodDesc);
        foodPriceTV = findViewById(R.id.foodPrice);
        quantityTV = findViewById(R.id.quantity);
        orderFoodBtn = findViewById(R.id.orderButton);
        foodPhotoIV = findViewById(R.id.foodPhoto);

        foodNameTV.setText(food.getFoodName());
        foodDescTV.setText(food.getFoodDesc());
        foodPriceTV.setText(String.valueOf(food.getFoodPrice()));
        quantityTV.setText(String.valueOf(originalQuantity));
        foodPhotoIV.setImageResource(food.getImageDrawableID());


        orderFoodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addToOrder();
                Toast.makeText(getApplicationContext(),"Item(s) added to Order, return back Home",Toast.LENGTH_LONG).show();
            }
        });

    }

    public void addQuantity(View view ) {
        originalQuantity++;
        quantityTV.setText(String.valueOf(originalQuantity));
    }
    public void minusQuantity (View view) {
        if(originalQuantity>1) {
            originalQuantity--;
            quantityTV.setText(String.valueOf(originalQuantity));
        }
        else {
            quantityTV.setText(String.valueOf(originalQuantity));


        }
        }

    public void addToOrder() {

        String foodName = (String) foodNameTV.getText();
        String foodPrice = (String) foodPriceTV.getText();
        int price = Integer.parseInt(foodPrice);
        int itemCost = price * originalQuantity;

        MainActivity.orderItems.add(new OrderItem(foodName, price, originalQuantity, itemCost));

        for (int i = 0; i < MainActivity.orderItems.size(); i++) {
            System.out.println(MainActivity.orderItems.get(i));
        }
        System.out.println(itemCost);




    }


    }

