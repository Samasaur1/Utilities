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
    public void removeProfanityFromLowercaseCleanStringTest() {
        Assert.assertEquals("clean", Utilities.removeProfanity("clean"));
    }

    @Test
    public void removeProfanityFromMixedCaseCleanStringTest() {
        Assert.assertEquals("cLeAn", Utilities.removeProfanity("cLeAn"));
    }

    @Test
    public void removeProfanityFromUppercaseCleanStringTest() {
        Assert.assertEquals("CLEAN", Utilities.removeProfanity("CLEAN"));
    }

    @Test
    public void removeProfanityFromLowercaseDirtyStringTest() {
        Assert.assertEquals("****", Utilities.removeProfanity("crap"));
    }

    @Test
    public void removeProfanityFromMixedCaseDirtyStringTest() {
        Assert.assertEquals("****", Utilities.removeProfanity("cRaP"));
    }

    @Test
    public void removeProfanityFromUppercaseDirtyStringTest() {
        Assert.assertEquals("****", Utilities.removeProfanity("CRAP"));
    }

    @Test
    public void removeProfanityFromInsidePartiallyDirtyStringTest() {
        Assert.assertEquals("Acrapa", Utilities.removeProfanity("Acrapa"));
    }

    @Test
    public void removeProfanityFromInsideUnderscoresTest() {
        Assert.assertEquals("A_****_a", Utilities.removeProfanity("A_crap_a"));
    }

    @Test
    public void removeProfanityFromInsideHypensTest() {
        Assert.assertEquals("A-****-a", Utilities.removeProfanity("A-crap-a"));
    }

    @Test
    public void removeProfanityFromInsidePeriodsTest() {
        Assert.assertEquals("A.****.a", Utilities.removeProfanity("A.crap.a"));
    }

    @Test
    public void removeProfanityFromInsideNumbersTest() {
        Assert.assertEquals("A1****1a", Utilities.removeProfanity("A1crap1a"));
    }
}
