package com.codeclan.example.fantasyzoomanager;

import com.codeclan.example.fantasyzoomanager.Creatures.Creature;
import com.codeclan.example.fantasyzoomanager.Creatures.Manticore;
import com.codeclan.example.fantasyzoomanager.Foods.Feedable;
import com.codeclan.example.fantasyzoomanager.Foods.Fish;
import com.codeclan.example.fantasyzoomanager.Foods.Meat;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 5/28/17.
 */
public class ManticoreTest {


    Manticore manticore;
    Feedable meat;
    Feedable fish;
    Creature creature;

    @Before
    public void before(){
        manticore = new Manticore("Garry");
        meat = new Meat();
        fish = new Fish();
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

    @Test
    public void manticoreEatMeatArraySize() {
        Manticore manticore = new Manticore("Garry");
        manticore.feed(meat);
        assertEquals(1, manticore.feedAmount());
    }

    @Test
    public void manticoreHasbeenFedFoodItDontLike() {
        Manticore manticore = new Manticore("Garry");
        assertEquals("Blergh!!!", manticore.feed(fish));
    }





}