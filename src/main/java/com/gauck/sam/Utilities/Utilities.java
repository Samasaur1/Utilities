package com.gauck.sam.Utilities;

import java.util.*;

/**
 * A utility class to help do things.
 */
public final class Utilities {
    /**
     * A private constructor so that this class cannot be instantiated.
     */
    private Utilities() throws Exception {
        throw new Exception("Don't instantiate this class!");
    }

    /**
     * A method that takes a string and capitalizes it correctly (e.g. eXamPLe → Example).
     *
     * @param original The string to be capitalized.
     * @return A capitalized version of the parameter.
     */
    public static String capitalize(String original) {
        if (original == null) return null; //Make sure we weren't passed null.
        if (original.trim().isEmpty()) return original; //If all it has is whitespace, return it.
        int index = 0;
        String firstChar = original.substring(index, index + 1);
        while (firstChar.trim().isEmpty()) {
            index += 1;
            firstChar = original.substring(index, index + 1);
        }
        return original.substring(0, index) + original.substring(index, index + 1).toUpperCase() + original.substring(index + 1).toLowerCase();
    }

    /**
     * A method that takes some number of integers and returns the average of them
     *
     * @param values The ints to take the average of.
     * @return The average of the parameters.
     */
    public static double average(int[] values) {
        int total = 0;
        for (int i : values) {
            total += i;
        }
        return total / values.length;
    }

    /**
     * Returns a map (dictionary in other languages) from an ArrayList of keys and one of values.
     *
     * @param keys   An ArrayList of the keys for the Map.
     * @param values An ArrayList of the values for the Map.
     * @param <K>    The type of the keys for the map.
     * @param <V>    The type of the values for the map.
     * @return A Map consisting of the keys paired to the values.
     */
    public static <K, V> Map<K, V> generateMap(ArrayList<K> keys, ArrayList<V> values) {
        Map<K, V> map = new HashMap<>();
        if (keys.size() == values.size()) {
            for (int i = 0; i < keys.size(); i++) {
                map.put(keys.get(i), values.get(i));
            }
        }
        return map;
    }

    /**
     * Removes profanity from a given string.
     *
     * @param original The string to 'clean'.
     * @return The cleaned string.
     */
    public static String removeProfanity(String original) {
        for (String bad : profaneWords) {
            original = original.replaceAll(bad, clean(bad));
        }
        return original;
    }

    /**
     * Removes profanity from every string in a given ArrayList.
     *
     * @param original The ArrayList to 'clean'.
     * @return The cleaned ArrayList.
     */
    public static ArrayList<String> removeProfanity(ArrayList<String> original) {
        original.forEach(Utilities::removeProfanity);
        return original;
    }

    /**
     * Takes a word and replaces it with a string of "*"s the same length as the given string.
     *
     * @param dirty The string to replace.
     * @return A string of "*"s.
     */
    private static String clean(String dirty) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < dirty.length(); i++) {
            s.append("*");
        }
        return s.toString();
    }

    /**
     * List of prohibited profane words.
     */
    private static Set<String> profaneWords = new HashSet<>(Arrays.asList(
            "fuck", "shit", "bitch", "ass", "crap", "piss", "dick", "cock", "pussy",
            "asshole", "fag", "bastard", "slut", "douche", "cunt", "damn"));
}
