package com.codeclan.example.fantasyzoomanager;

import com.codeclan.example.fantasyzoomanager.Foods.Meat;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 5/28/17.
 */
public class MeatTest {


    @Test
    public void meatExists() {
        Meat meat = new Meat();
        assertNotNull(meat);
    }

    @Test
    public void meatTypeCheck() {
        Meat meat = new Meat();
        assertEquals("meat", meat.foodType());
    }


}