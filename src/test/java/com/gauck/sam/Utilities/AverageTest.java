package com.gauck.sam.Utilities;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for the {@link Utilities} average() function.
 *
 * @author Samasaur
 */
public class AverageTest {
    @Test
    public void averageEmptyArrayTest() {
        Assert.assertEquals(0, Utilities.average(new int[]{}), 0);
    }

    @Test
    public void averageNullTest() {
        Assert.assertEquals(0, Utilities.average(null), 0);
    }

    @Test
    public void averageOneNumberArrayTest() {
        for (int i = 0; i <= 10; i++) {
            Assert.assertEquals("Failed on: " + i, i, Utilities.average(new int[]{i}), 0);
        }
    }

    @Test
    public void averageFiveNumberArrayTest() {
        int[] values = new int[5];
        int total = 0;
        for (int i = 0; i < 5; i++) {
            values[i] = (int) Math.round(Math.random() * 100);
            total += values[i];
        }
        Assert.assertEquals(total / 5, Utilities.average(values), 0);
    }

    @Test
    public void averageOneHundredNumberArrayTest() {
        int[] values = new int[100];
        int total = 0;
        for (int i = 0; i < 100; i++) {
            values[i] = (int) Math.round(Math.random() * 100);
            total += values[i];
        }
        Assert.assertEquals(total / 100, Utilities.average(values), 0);
    }
}
