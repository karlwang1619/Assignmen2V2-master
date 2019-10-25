package com.example.assignmen2v2;

public class OrderItem {

    private String foodName;
    private int price;
    private int quantity;
    private int cost;


    public OrderItem(String foodName, int price, int quantity, int cost) {
        this.foodName = foodName;
        this.price = price;
       this.quantity = quantity;
       this.cost = cost;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Food Name: " + foodName + "\n" +
                "Price: " + "$" + price + "\n" +
                "Quantity x " + quantity + "\n " +
                "Total " + "$" + cost + "\n" +"\n";
    }
}
