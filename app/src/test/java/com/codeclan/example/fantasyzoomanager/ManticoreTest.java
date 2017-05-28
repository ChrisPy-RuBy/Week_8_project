package com.codeclan.example.fantasyzoomanager;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 5/28/17.
 */
public class ManticoreTest {


    Manticore manticore;
    Feedable meat;

    @Before
    public void before(){
        manticore = new Manticore("Garry");
        meat = new Meat();
    }

    @Test
    public void manticoreExists() {
        Manticore manticore = new Manticore("Garry");
        assertNotNull(manticore);
    }

    @Test
    public void manticoreEatMeat() {
        Manticore manticore = new Manticore("Garry");
        assertEquals("NOMNOMNOM", manticore.feed(meat));

    }



}