package com.gauck.sam.Utilities;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * Unit tests for the {@link Utilities} removeProfanity(ArrayList<String> original) function.
 *
 * @author Samasaur
 */
public class RemoveProfanityArrayListTest {
    @Test
    public void removeProfanityFromEmptyArrayListTest() {
        Assert.assertEquals(new ArrayList<String>(), Utilities.removeProfanity(new ArrayList<>()));
    }

    @Test
    public void removeProfanityFromNullTest() {
        Assert.assertNull(Utilities.removeProfanity(((ArrayList<String>) null)));
    }

    @Test
    public void removeProfanityFromCleanStringTest() {
        ArrayList<String> list = new ArrayList<>(Collections.singleton("Sorry, Stringy"));
        Assert.assertEquals(list, Utilities.removeProfanity(list));
    }

    @Test
    public void removeProfanityFromDirtyStringTest() {
        Assert.assertEquals(new ArrayList<>(Collections.singleton("****")), Utilities.removeProfanity(new ArrayList<>(Collections.singleton("crap"))));
    }

    @Test
    public void removeProfanityFromCleanStringAndCleanStringTest() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I didn't", "want to"));
        Assert.assertEquals(list, Utilities.removeProfanity(list));
    }

    @Test
    public void removeProfanityFromCleanStringAndDirtyStringTest() {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Do this", "Crap nuggets"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Do this", "**** nuggets"));
        Assert.assertEquals(list2, Utilities.removeProfanity(list1));
    }

    @Test
    public void removeProfanityFromDirtyStringAndDirtyStringTest() {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Now I'm pissed off", "Shit, I'm sorry"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Now I'm ****ed off", "****, I'm sorry"));
        Assert.assertEquals(list2, Utilities.removeProfanity(list1));
    }
}
