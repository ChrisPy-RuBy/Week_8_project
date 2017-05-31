package com.codeclan.example.fantasyzoomanager.Creatures;

import com.codeclan.example.fantasyzoomanager.Enclosures.Breedable;
import com.codeclan.example.fantasyzoomanager.Foods.Feedable;
import com.codeclan.example.fantasyzoomanager.HabitatType;

import java.util.ArrayList;

/**
 * Created by mac on 5/28/17.
 */

public class Manticore extends Creature implements Breedable {

    private HabitatType habitat;
    private String sex;

    public Manticore(String name, String sex) {
        super(name, HabitatType.UNDERGROUND);
        this.sex = sex;
    }

    public String feed(Feedable food) {
        String foodType = food.foodType();
        if (foodType.equals("meat")) {
            return super.feed(food);
        } else if (foodType.equals("fish")) {
            return "Blergh!!!";
        }
        fed.add(food);
        return "Ok but I don't like it";
    }


    public String getSex() {
        return this.sex;
    }

    public Creature makeBaby() {
        if (this.sex.equals("f")) {
            Manticore newManticore = (new Manticore("baby", "f"));
            return newManticore;
        }
        else { return super.makeBaby();
        }
    }


}

