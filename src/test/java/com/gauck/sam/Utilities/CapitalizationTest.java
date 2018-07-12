package com.gauck.sam.Utilities;

import org.junit.*;

import java.util.*;

/**
 * Unit tests for the {@link Utilities} capitalize() function.
 *
 * @author Samasaur
 */
public class CapitalizationTest {

    private final static ArrayList<String> letters = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));

    @Test
    public void capitalizeEmptyStringTest() {
        Assert.assertEquals("", Utilities.capitalize(""));
    }

    @Test
    public void capitalizeLowercaseLetterTest() {
        letters.forEach((letter -> Assert.assertEquals(letter.toUpperCase(), Utilities.capitalize(letter))));
        Assert.assertEquals("A", Utilities.capitalize("a")); //Encompassed, but we'll leave it in in case my forEach is wrong.
    }

    @Test
    public void capitalizeUppercaseLetterTest() {
        letters.forEach(letter -> Assert.assertEquals(letter.toUpperCase(), Utilities.capitalize(letter.toUpperCase())));
        Assert.assertEquals("A", Utilities.capitalize("A")); //Encompassed, but we'll leave it in in case my forEach is wrong.
    }

    @Test
    public void capitalizeSpaceTest() {
        Assert.assertEquals(" ", Utilities.capitalize(" "));
    }

    @Test
    public void capitalizeLowercaseLetterAndSpaceTest() {
        letters.forEach(letter -> Assert.assertEquals(letter.toUpperCase() + " ", Utilities.capitalize(letter + " ")));
        Assert.assertEquals("A ", Utilities.capitalize("a ")); //Encompassed, but we'll leave it in in case my forEach is wrong.
    }

    @Test
    public void capitalizeUppercaseLetterAndSpaceTest() {
        letters.forEach(letter -> Assert.assertEquals(letter.toUpperCase() + " ", Utilities.capitalize(letter.toUpperCase() + " ")));
        Assert.assertEquals("A ", Utilities.capitalize("A ")); //Encompassed, but we'll leave it in in case my forEach is wrong.
    }

    @Test
    public void capitalizeSpaceAndLowercaseLetterTest() {
        letters.forEach(letter -> Assert.assertEquals(" " + letter.toUpperCase(), Utilities.capitalize(" " + letter)));
        Assert.assertEquals(" A", Utilities.capitalize(" a")); //Encompassed, but we'll leave it in in case my forEach is wrong.
    }

    @Test
    public void capitalizeSpaceAndUppercaseLetterTest() {
        letters.forEach(letter -> Assert.assertEquals(" " + letter.toUpperCase(), Utilities.capitalize(" " + letter.toUpperCase())));
        Assert.assertEquals(" A", Utilities.capitalize(" A")); //Encompassed, but we'll leave it in in case my forEach is wrong.
    }

    @Test
    public void capitalizeLowercaseLetterAndSpaceAndLowercaseLetterTest() {
        letters.forEach(letter1 -> letters.forEach(letter2 -> Assert.assertEquals(letter1.toUpperCase() + " " + letter2, Utilities.capitalize(letter1 + " " + letter2))));
        Assert.assertEquals("A a", Utilities.capitalize("a a")); //Encompassed, but we'll leave it in in case my forEach-es are wrong.
    }

    @Test
    public void capitalizeUppercaseLetterAndSpaceAndLowercaseLetterTest() {
        letters.forEach(letter1 -> letters.forEach(letter2 -> Assert.assertEquals(letter1.toUpperCase() + " " + letter2, Utilities.capitalize(letter1.toUpperCase() + " " + letter2))));
        Assert.assertEquals("A a", Utilities.capitalize("A a")); //Encompassed, but we'll leave it in in case my forEach-es are wrong.
    }

    @Test
    public void capitalizeLowercaseLetterAndSpaceAndUppercaseLetterTest() {
        letters.forEach(letter1 -> letters.forEach(letter2 -> Assert.assertEquals(letter1.toUpperCase() + " " + letter2, Utilities.capitalize(letter1 + " " + letter2.toUpperCase()))));
        Assert.assertEquals("A a", Utilities.capitalize("a A")); //Encompassed, but we'll leave it in in case my forEach-es are wrong.
    }

    @Test
    public void capitalizeUppercaseLetterAndSpaceAndUppercaseLetterTest() {
        letters.forEach(letter1 -> letters.forEach(letter2 -> Assert.assertEquals(letter1.toUpperCase() + " " + letter2, Utilities.capitalize(letter1.toUpperCase() + " " + letter2.toUpperCase()))));
        Assert.assertEquals("A a", Utilities.capitalize("A A")); //Encompassed, but we'll leave it in in case my forEach-es are wrong.
    }

    @Test
    public void capitalizeSpaceAndLowercaseLetterAndSpaceTest() {
        letters.forEach(letter -> Assert.assertEquals(" " + letter.toUpperCase() + " ", Utilities.capitalize(" " + letter + " ")));
        Assert.assertEquals(" A ", Utilities.capitalize(" a ")); //Encompassed, but we'll leave it in in case my forEach is wrong.
    }

    @Test
    public void capitalizeSpaceAndUppercaseLetterAndSpaceTest() {
        letters.forEach(letter -> Assert.assertEquals(" " + letter.toUpperCase() + " ", Utilities.capitalize(" " + letter.toUpperCase() + " ")));
        Assert.assertEquals(" A ", Utilities.capitalize(" A ")); //Encompassed, but we'll leave it in in case my forEach is wrong.
    }

    @Test
    public void capitalizeLowercaseLetterAndLowercaseLetterTest() {
        letters.forEach(letter1 -> letters.forEach(letter2 -> Assert.assertEquals(letter1.toUpperCase() + letter2, Utilities.capitalize(letter1 + letter2))));
        Assert.assertEquals("Aa", Utilities.capitalize("aa"));
    }

    @Test
    public void capitalizeUppercaseLetterAndLowercaseLetterTest() {
        letters.forEach(letter1 -> letters.forEach(letter2 -> Assert.assertEquals(letter1.toUpperCase() + letter2, Utilities.capitalize(letter1.toUpperCase() + letter2))));
        Assert.assertEquals("Aa", Utilities.capitalize("Aa"));
    }

    @Test
    public void capitalizeLowercaseLetterAndUppercaseLetterTest() {
        letters.forEach(letter1 -> letters.forEach(letter2 -> Assert.assertEquals(letter1.toUpperCase() + letter2, Utilities.capitalize(letter1 + letter2.toUpperCase()))));
        Assert.assertEquals("Aa", Utilities.capitalize("aA"));
    }

    @Test
    public void capitalizeUppercaseLetterAndUppercaseLetterTest() {
        letters.forEach(letter1 -> letters.forEach(letter2 -> Assert.assertEquals(letter1.toUpperCase() + letter2, Utilities.capitalize(letter1.toUpperCase() + letter2.toUpperCase()))));
        Assert.assertEquals("Aa", Utilities.capitalize("AA"));
    }

    @Test
    public void capitalizeNullTest() {
        Assert.assertNull(Utilities.capitalize(null));
    }
}
