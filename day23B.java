/*
Day 23 — Challenge #5 (Sliding Window – Repeating Patterns)
Given:

Two strings s (source) and t (target)

Return:

The smallest substring of s that contains all characters of t (including duplicates).

If no such substring exists, return an empty string.
*/

import java.util.HashMap;

public class day23B {
    static void minimumWindowSubstring(String s, String t){
        HashMap<Character, Integer> mapT = new HashMap<>();

        for(char charT : t.toCharArray()){
            mapT.put(charT, mapT.getOrDefault(charT, 0) + 1);
        }

        HashMap<Character, Integer> mapS = new HashMap<>();

        for(char charS : s.toCharArray()){
            mapS.put(charS, mapS.getOrDefault(charS, 0) + 1); 
        }

    }
    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";

        minimumWindowSubstring(s, t);
    }
}
