package com.example.assignmen2v2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FoodDatabase {

    public static Food getFoodByID(int foodID) {
        return menu.get(foodID);
    }

    public static ArrayList<Food> getAllFood() {
        return new ArrayList<Food>((List) Arrays.asList(menu.values().toArray()));
    }


    public static final HashMap<Integer, Food> menu = new HashMap<>();

    static {
        menu.put(1, new Food (
                1,
                "Simply Grilld",
                10,
                "Amazing beef burger topped with salad, relish and herb mayo",
                R.drawable.drawable1
        ));

        menu.put(2, new Food (
                2,
                "Crispy Bacon and Cheese",
                11,
                "Beef Burger with crispy bacon, a fried egg and topped with salad, relsih and herb mayo",
                R.drawable.drawable2
        ));

        menu.put(3, new Food(
                3,
                "Almighty",
                12,
                "The ultimate burger topped with cheese, egg, salad, beetroot with our signature relish and herb mayo",
                R.drawable.drawable3

        ));

        menu.put(4, new Food (
                4,
                "Summer Sunset",
                12,
                "Our refreshing beef burger with crispy bacon and sweet golden pineapple slices",
                R.drawable.drawable4
        ));

        menu.put(5, new Food (
                5,
                "Mustard and Pickled",
                13,
                "Our classic burger with dijon mustard, pickle, tasty cheese, salad and relish",
                R.drawable.drawable5
        ));

        menu.put(6, new Food (
                6,
                "Chilli Addict",
                11,
                "Our hot burger with fiery jalapenos, roasted peppers, sour cream, salad and our signature relish",
                R.drawable.drawable6
        ));

        menu.put(7, new Food(
                7,
                "Zen Hen",
                14,
                "Chicken Burger with satay sauce, coriander, shredded carrot, salad and herb mayo",
                R.drawable.drawable7

        ));

        menu.put(8, new Food (
                8,
                "Baa Baa Burger",
                13,
                "Lamb Burger with avocado, cheese, salad and our signature herb mayo and relish combo",
                R.drawable.drawable8
        ));

        menu.put(9, new Food (
                9,
                "BBQ Brisket",
                12,
                "Premium Beef Broslet with a creamy coleslaw and aged cheddar and pickle",
                R.drawable.drawable9
        ));

        menu.put(10, new Food (
                10,
                "Hot Bird",
                15,
                "Famous Fried Chicken Burger with spicy jalapenos, roasted pepper sour cream cheese and crunchy lettuce and chilli relish",
                R.drawable.drawable10
        ));

        menu.put(11, new Food(
                11,
                "Chicken Caesar Salad",
                16,
                "Crispy Cos lettuce mixed with crunchy croutons, egg and our special house made caesar dressing",
                R.drawable.drawable11

        ));

        menu.put(12, new Food (
                12,
                "Famous Bopp'n Chips",
                14,
                "Our Famous potato chips topped with our Bopp'n Special Herb Mix",
                R.drawable.drawable12
        ));

        menu.put(13, new Food (
                13,
                "Zucchini Chips",
                13,
                "Crispy Zucchini Chips lightly salted with himalayan pink rock salt",
                R.drawable.drawable13
        ));

        menu.put(14, new Food (
                14,
                "Sweet Potato Fries",
                16,
                "Delicious Sweet Potato thinly sliced into fries topped with himalayan pink rock salt",
                R.drawable.drawable14
        ));

        menu.put(15, new Food(
                15,
                "Chips Share Plate",
                12,
                "A share plate combo of our famous Bopp'n Chips, Zucchini Chips and Sweet Potato Fries",
                R.drawable.drawable15

        ));
    }

}
