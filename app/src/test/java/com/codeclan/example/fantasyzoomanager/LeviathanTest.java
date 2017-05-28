package com.codeclan.example.fantasyzoomanager;

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

}