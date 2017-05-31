package com.codeclan.example.fantasyzoomanager.Creatures;

import android.util.Log;

import com.codeclan.example.fantasyzoomanager.Foods.Feedable;
import com.codeclan.example.fantasyzoomanager.HabitatType;

import java.util.ArrayList;

/**
 * Created by mac on 5/28/17.
 */

public class Leviathan extends Creature implements Feedable {

    private String foodType;

    public Leviathan(String name) {
        super(name, HabitatType.DEEPOCEAN);
        this.foodType = "leviathan";
    }

    public String feed(Feedable food) {
        String foodType = food.foodType();
        if (foodType.equals("fish")) {
            return super.feed(food);
        } else if (foodType.equals("insects")) {
            return "Blergh!!!";
        } else if (foodType.equals("ambergris")) {
            makeBaby();
        } else {
            fed.add(food);
            return "Ok but I don't like it";
        }
        return "derp";
    }

    public String foodType() {
        return this.foodType;
    }

    public String getRoar() {
        return "screech";
    }

    public Creature makeBaby() {
        Leviathan leviathan = new Leviathan("Tiffany");
        feed(leviathan);
        Leviathan leviathan1 = new Leviathan("Derek");
        feed(leviathan1);
        Leviathan leviathan2 = new Leviathan("Edward");
        feed(leviathan2);
        Leviathan leviathan3 = new Leviathan("Danny");
        feed(leviathan3);
        Leviathan leviathan4 = new Leviathan("Jenny");
        feed(leviathan4);
        return null;
    }

//    public ArrayList<Leviathan> vomitBabies() {
//        ArrayList<Leviathan> newBabies = new ArrayList<>();
//        for (Feedable food: fed) {
//            if ((food.foodType()).equals("leviathan")) {
//                newBabies.add((Leviathan)food);
//                fed.remove(food);
//            }
//        }
//        return newBabies;
//    }

}



