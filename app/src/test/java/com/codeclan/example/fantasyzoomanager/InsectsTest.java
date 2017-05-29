package com.codeclan.example.fantasyzoomanager;

import com.codeclan.example.fantasyzoomanager.Foods.Insects;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 5/28/17.
 */
public class InsectsTest {

    Insects insects = new Insects();

    @Test
    public void insectObjectExists() {
        assertNotNull(insects);
    }

}