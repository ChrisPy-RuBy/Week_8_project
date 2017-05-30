package com.codeclan.example.fantasyzoomanager.Creatures;

import com.codeclan.example.fantasyzoomanager.Foods.Feedable;
import com.codeclan.example.fantasyzoomanager.HabitatType;

import java.util.ArrayList;

/**
 * Created by mac on 5/30/17.
 */

public class Goblin extends Creature implements Feedable {


    private HabitatType habitat;
    private ArrayList<Feedable> fed = new ArrayList<Feedable>();
    private String sex;


    public Goblin(String name) {
        super(name, HabitatType.UNDERGROUND);
    }

    public String foodType() {
        return "goblin";
    }





}
