package com.example.assignmen2v2;

public class Food {

    private int foodID;
    private String foodName;
    private int foodPrice;
    private String foodDesc;
    private int imageDrawableID;

    public Food(int foodID, String foodName, int foodPrice, String foodDesc, int imageDrawableID) {
        this.foodID = foodID;
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.foodDesc = foodDesc;
        this.imageDrawableID = imageDrawableID;

    }

    public int getFoodID() {
        return foodID;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public String getFoodDesc() {
        return foodDesc;
    }

    public int getImageDrawableID() {
        return imageDrawableID;
    }
}
