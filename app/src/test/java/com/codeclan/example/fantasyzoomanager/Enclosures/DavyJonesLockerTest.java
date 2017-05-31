package com.codeclan.example.fantasyzoomanager.Enclosures;

import com.codeclan.example.fantasyzoomanager.HabitatType;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 5/29/17.
 */
public class DavyJonesLockerTest {

    @Test
    public void testEnclosureExists() {
        DavyJonesLocker davyjoneslocker = new DavyJonesLocker();
        assertNotNull(davyjoneslocker);
    }

    @Test
    public void testHabitatType() {
        DavyJonesLocker davyjoneslocker = new DavyJonesLocker();
        assertEquals(HabitatType.DEEPOCEAN, davyjoneslocker.getHabitat());
    }

}