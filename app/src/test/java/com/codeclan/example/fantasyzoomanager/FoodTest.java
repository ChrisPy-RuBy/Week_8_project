package com.codeclan.example.fantasyzoomanager;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 5/28/17.
 */
public class FoodTest {

    Food food;

    @Before
    public void before() {
        food = new Food();
    }

    @Test
    public void doesFoodObjectExist() {
        assertNotNull(food);
    }

}