package com.gauck.sam.Utilities;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for the {@link Utilities} removeProfanity(String original) function.
 *
 * @author Samasaur
 */
public class RemoveProfanityStringTest {
    @Test
    public void removeProfanityFromNullTest() {
        Assert.assertNull(Utilities.removeProfanity((String) null));
    }

    @Test
    public void removeProfanityFromEmptyStringTest() {
        Assert.assertEquals("", Utilities.removeProfanity(""));
    }

    @Test
    public void removeProfanityFromSpaceTest() {
        Assert.assertEquals(" ", Utilities.removeProfanity(" "));
    }

    @Test
    public void removeProfanityFromCleanStringTest() {
        Assert.assertEquals("Any string that doesn't contain profanity", Utilities.removeProfanity("Any string that doesn't contain profanity"));
    }

    @Test
    public void removeProfanityFromDirtyStringTest() {
        Assert.assertEquals("****", Utilities.removeProfanity("crap"));
    }

    @Test
    public void removeProfanityFromInsidePartiallyDirtyStringTest() {
        Assert.assertEquals("A****a", Utilities.removeProfanity("Acrapa"));
    }
}
