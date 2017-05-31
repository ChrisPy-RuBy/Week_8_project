package com.codeclan.example.fantasyzoomanager;

import com.codeclan.example.fantasyzoomanager.Foods.Feedable;
import com.codeclan.example.fantasyzoomanager.Enclosures.Inticable;
import com.codeclan.example.fantasyzoomanager.Enclosures.FeedableAndEnticable;

import dalvik.annotation.TestTargetClass;

/**
 * Created by mac on 5/29/17.
 */

public class Visitor implements FeedableAndEnticable {

    private String name;
    private String sex;

    public Visitor(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSex() {return sex;}

    public String foodType() {
        return "human";
    }
}
