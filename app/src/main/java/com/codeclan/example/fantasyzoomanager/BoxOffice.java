package com.codeclan.example.fantasyzoomanager;

import java.util.ArrayList;

/**
 * Created by mac on 5/29/17.
 */

public class BoxOffice {


    private ArrayList<Visitor> guestsInPark;
    private int totalTakings;
    private int numberOfGuestsInPark;


    public BoxOffice(){
        guestsInPark = new ArrayList<>();
        this.totalTakings = 0;
        this.numberOfGuestsInPark = 0;
    }

    public void addVisitor(Visitor visitor) {
        guestsInPark.add(visitor);
    }

    public int totalVisitors() {
      numberOfGuestsInPark = guestsInPark.size();
      return numberOfGuestsInPark;
    }

    public int totaltakings () {
        totalTakings = guestsInPark.size()* 7;
        return totalTakings;
    }
}
