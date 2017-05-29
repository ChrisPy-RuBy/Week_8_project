package com.codeclan.example.fantasyzoomanager.Enclosures;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 5/29/17.
 */
public class DavyJonesLockerTest {

    @Test
    public void testEnclosureExists() {
        DavyJonesLocker davyjoneslocker = new DavyJonesLocker("murder room");
        assertNotNull(davyjoneslocker);
    }

}