package com.rajyawardhan.interceptor.niyug;

import java.util.*;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        // Input
        String[] inputArray = {"cat", "cat", "tac", "dog", "god", "act"};

        // Processing
        Map<String, Set<String>> wordsToAnagram = mapWordsToAnagrams(inputArray);

        // Print result
        wordsToAnagram.values().forEach(System.out::print);
    }

    public static Map<String, Set<String>> mapWordsToAnagrams(String[] inputArray) {
        return Arrays.stream(inputArray)
                .collect(Collectors.groupingBy(Runner::sortWord, Collectors.toSet()));

    }

    public static String sortWord(String str) {
        char[] strCharArr = str.toCharArray();
        Arrays.sort(strCharArr);
        return new String(strCharArr);
    }
}