package com.codeclan.example.fantasyzoomanager.Creatures;

import com.codeclan.example.fantasyzoomanager.Creatures.Leviathan;
import com.codeclan.example.fantasyzoomanager.Foods.Feedable;
import com.codeclan.example.fantasyzoomanager.Foods.Fish;
import com.codeclan.example.fantasyzoomanager.Foods.Insects;
import com.codeclan.example.fantasyzoomanager.Foods.Meat;
import com.codeclan.example.fantasyzoomanager.HabitatType;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 5/28/17.
 */
public class LeviathanTest {

    Feedable meat;
    Feedable fish;
    Feedable insects;

    @Before
    public void before() {

        meat = new Meat();
        fish = new Fish();
        insects = new Insects();
    }

    @Test
    public void leviathanExists() {
        Leviathan leviathan = new Leviathan("Bazzers");
        assertNotNull(leviathan);
    }


    @Test
    public void leviathanHasHabitatEnum() {
        Leviathan leviathan = new Leviathan("Bazzers");
        Assert.assertEquals(HabitatType.DEEPOCEAN, leviathan.getHabitat());
    }

    @Test
    public void leviathanHasbeenFedFoodItDontLike() {
        Leviathan leviathan = new Leviathan("Bazzers");
        assertEquals("Blergh!!!", leviathan.feed(insects));
    }

    @Test
    public void leviathanHasbeenFedFoodTest() {
        Leviathan leviathan = new Leviathan("Bazzers");
        leviathan.feed(fish);
        assertEquals(1, leviathan.feedAmount());
    }


}