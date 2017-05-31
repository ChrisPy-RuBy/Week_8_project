package com.codeclan.example.fantasyzoomanager.Creatures;

import com.codeclan.example.fantasyzoomanager.Creatures.Creature;
import com.codeclan.example.fantasyzoomanager.Creatures.Manticore;
import com.codeclan.example.fantasyzoomanager.Foods.Feedable;
import com.codeclan.example.fantasyzoomanager.Foods.Fish;
import com.codeclan.example.fantasyzoomanager.Foods.Meat;
import com.codeclan.example.fantasyzoomanager.HabitatType;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 5/28/17.
 */
public class ManticoreTest {


    Manticore manticore;
    Manticore manticore2;
    Feedable meat;
    Feedable fish;
    Creature creature;

    @Before
    public void before(){
        manticore = new Manticore("Garry", "m");
        manticore2 = new Manticore("Bella", "f");
        meat = new Meat();
        fish = new Fish();
    }

    @Test
    public void manticoreExists() {
        assertNotNull(manticore);
    }

    @Test
    public void manticoreEatMeat() {;
        assertEquals("NOMNOMNOM", manticore.feed(meat));
    }

    @Test
    public void manticoreEatMeatArraySize() {
        manticore.feed(meat);
        assertEquals(1, manticore.feedAmount());
    }

    @Test
    public void manticoreHasbeenFedFoodItDontLike() {
        assertEquals("Blergh!!!", manticore.feed(fish));
    }


    @Test
    public void manticoreLivesUnderground() {;
        assertEquals(HabitatType.UNDERGROUND, manticore.getHabitat());
    }

    @Test
    public void manicoreHasSexTeeHeeGrowUpYouTwat() {
        assertEquals("m", manticore.getSex());
    }

    @Test
    public void manticoreMakeBabyManticore() {
        assertTrue(manticore2.makeBaby() instanceof Manticore);
    }






}