package com.codeclan.example.fantasyzoomanager.Creatures;

import com.codeclan.example.fantasyzoomanager.Creatures.Leviathan;
import com.codeclan.example.fantasyzoomanager.HabitatType;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 5/28/17.
 */
public class LeviathanTest {

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

}