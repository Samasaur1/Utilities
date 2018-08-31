package com.gauck.sam.Utilities;

import java.util.*;

/**
 * A utility class to help do things.
 *
 * @author Samasaur
 */
public final class Utilities {
    /**
     * A private constructor so that this class cannot be instantiated.
     */
    private Utilities() throws Exception {
        throw new Exception("Don't instantiate this class!");
    }

    /**
     * Returns a correctly capitalized string.
     * If it is empty or null, it is returned unchanged.
     *
     * @param original The string to be capitalized.
     * @return A capitalized version of the passed string.
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
     * Returns the average of an array of integers.
     *
     * @param values The ints to take the average of.
     * @return The average of the parameters.
     */
    public static double average(int[] values) {
        if (values == null) return 0;
        if (values.length == 0) return 0;
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
     * Removes profanity from a given string. Strings that are either empty or null will be returned unchanged.
     *
     * @param original The string to 'clean'. If this is null, this method returns null. If it is empty, it is returned unchanged.
     * @return The cleaned string. This is the original string, with any profane words (separated by nonalphabetic characters) replaced by * characters.
     */
    public static String removeProfanity(String original) {
        if (original == null) return null;
        for (String bad : profaneWords) {
            original = original.replaceAll("(?i)(?<![a-zA-Z])" + bad + "(?![a-zA-Z])", clean(bad));
        }
        return original;
    }

    /**
     * Removes profanity from every string in a given ArrayList.
     * Strings that are either empty or null will be returned unchanged. If the ArrayList is empty or null, it will be returned unchanged.
     * <p>
     * For every string in this ArrayList, the {@link #removeProfanity(String)} method is called on it.
     *
     * @param original The ArrayList to 'clean'. If this is null, this method returns null. If it is empty, it is returned unchanged.
     * @return The cleaned ArrayList. Each string in it has been cleansed.
     * @see #removeProfanity(String)
     */
    public static ArrayList<String> removeProfanity(ArrayList<String> original) {
        if (original == null) return null;
        for (int i = 0; i < original.size(); i++) {
            original.set(i, removeProfanity(original.get(i)));
        }
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
            "asshole", "fag", "bastard", "slut", "douche", "cunt", "damn", "pissed",
            "fucker", "motherfucker", "dammit"));
}
