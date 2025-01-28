package org.example;

import java.util.HashMap;
import java.util.Map;

public class DuplicateOccurence {

    public static void main(String[] args) {
        String s = "Selenium Automation";
        char[] c = s.toCharArray();
        Map<Character, Integer> m = new HashMap<>();

        for (char ch : c) {
            if (m.containsKey(ch)) {
                m.put(ch, m.get(ch) + 1);
            } else {
                m.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : m.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue() + "times.");

        }
    }
}