package com.practice;

import java.util.HashMap;



public class CharacterOccurrence {

    public static void main(String[] args) {
        String inputString = "Mayank";

        // Create a HashMap to store character occurrences
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through each character in the string
        for (char c : inputString.toCharArray()) {
            // Update the count in the HashMap
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Display the character occurrences
        System.out.println("Character occurrences in the string:");
        for (char c : charCountMap.keySet()) {
            System.out.println("'"+c+""+charCountMap.get(c));
        }
    }
}


