package com.codeclan.example.fantasyzoomanager.Enclosures;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 5/29/17.
 */
public class TheGoblinDenTest {

    @Test
    public void testEnclosureExists() {
        TheGoblinDen thegoblinden = new TheGoblinDen();
        assertNotNull(thegoblinden);
    }
}