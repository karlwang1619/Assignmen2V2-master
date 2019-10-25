package com.example.assignmen2v2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FoodAdaptor extends RecyclerView.Adapter<FoodAdaptor.FoodViewHolder> {

    private ArrayList<Food> FoodToAdapt;

    public void setData(ArrayList<Food> FoodToAdapt) {
        this.FoodToAdapt = FoodToAdapt;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_item, parent, false);
        FoodViewHolder foodViewHolder = new FoodViewHolder(view);
        return foodViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {

        final Food foodAtPosition = FoodToAdapt.get(position);
        holder.foodNameTV.setText(foodAtPosition.getFoodName());
        holder.foodPriceTV.setText(String.valueOf(foodAtPosition.getFoodPrice()));

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View view) {
                Context context = view.getContext();
                Intent intent = new Intent(context, FoodDetailActivity.class);
                intent.putExtra("FoodID", foodAtPosition.getFoodID());
                context.startActivity(intent);
            }
        });

        holder.foodPhotoIV.setImageResource(foodAtPosition.getImageDrawableID());



    }

    @Override
    public int getItemCount() {
        return FoodToAdapt.size();
    }

    public static class FoodViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView foodNameTV;
        public TextView foodPriceTV;
        public ImageView foodPhotoIV;


        public FoodViewHolder(View v) {
            super(v);
            view = v;
            foodNameTV = v.findViewById(R.id.foodName);
            foodPriceTV = v.findViewById(R.id.foodPrice);
            foodPhotoIV = v.findViewById(R.id.foodPhoto);

        }
    }
}
