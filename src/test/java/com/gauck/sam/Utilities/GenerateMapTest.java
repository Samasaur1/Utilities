package com.gauck.sam.Utilities;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * Unit tests for the {@link Utilities} generateMap() function.
 *
 * @author Samasaur
 */
public class GenerateMapTest {
    @Test
    public void generateEmptyMapTest() {
        Assert.assertEquals(new HashMap<Integer, Integer>(), Utilities.generateMap(new ArrayList<>(), new ArrayList<>()));
    }

    @Test
    public void generateUnevenMapTest() {
        Assert.assertEquals(new HashMap<Integer, Integer>(), Utilities.generateMap(new ArrayList<>(Collections.singletonList(1)), new ArrayList<>()));
    }

    @Test
    public void generateMapTest() {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> keys = new ArrayList<>();
        ArrayList<Integer> values = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            map.put(i, 100 - i);
            keys.add(i);
            values.add(100 - i);
        }
        Assert.assertEquals(map, Utilities.generateMap(keys, values));
    }
}
