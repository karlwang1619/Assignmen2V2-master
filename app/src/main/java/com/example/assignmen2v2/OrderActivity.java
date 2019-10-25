package com.example.assignmen2v2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

            public class OrderActivity extends AppCompatActivity {

                public TextView orderListTV;
                public TextView totalPriceTV;
                public String totalString;
                public static int totalCost;


                @Override
                protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_order);
                    orderListTV = findViewById(R.id.orderList);
                    totalPriceTV = findViewById(R.id.totalPrice);

                    totalString = String.valueOf(getTotal());

                    totalPriceTV.setText("Total Price: $" + totalString);

                    Intent intent = getIntent();

                    for (int i=0; i < MainActivity.orderItems.size(); i++) {
                        orderListTV.setText(orderListTV.getText() + " " + MainActivity.orderItems.get(i));

                    }
                }
                public static int getTotal() {
                    for (int i = 0; i < MainActivity.orderItems.size(); i++) {

                        int itemCost = MainActivity.orderItems.get(i).getCost();
                        totalCost += itemCost;
                    }
                    return totalCost;

        }
    }

