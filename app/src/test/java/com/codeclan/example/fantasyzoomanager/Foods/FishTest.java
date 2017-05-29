package com.codeclan.example.fantasyzoomanager.Foods;

import com.codeclan.example.fantasyzoomanager.Foods.Fish;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 5/28/17.
 */
public class FishTest {

    @Test
    public void fishExists() {
        Fish fish = new Fish();
        assertNotNull(fish);
    }

}