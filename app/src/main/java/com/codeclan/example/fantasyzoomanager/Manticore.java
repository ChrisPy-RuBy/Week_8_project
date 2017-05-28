package com.codeclan.example.fantasyzoomanager;

import java.util.ArrayList;

/**
 * Created by mac on 5/28/17.
 */

public class Manticore extends Creature implements Feedable {

    private ArrayList<Feedable> fed = new ArrayList<Feedable>();

    public Manticore(String name) {
            super(name);
        }

    public String feed(Feedable food) {
        String foodType = food.foodType();
        if (food.equals(foodType)) {
            fed.add(food);
            return "NOMNOMNOM";
        }
        else {
            return "Blergh!!!";
        }

    }

}
