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
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();
        int left = 0, right, window = 0, count = 0;

        for(char c : t.toCharArray()){
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }

        for(right = 0; right < s.length(); right++){
            char c = s.charAt(right);

            if(mapT.containsKey(c)){
                mapS.put(c, mapS.getOrDefault(c, 0) + 1);

                if(mapS.get(c).intValue() == mapT.get(c).intValue()){
                    count++;
                }
            }   

            while(count == mapT.size()){
                    char lft = s.charAt(left);
                    mapS.put(lft, mapS.get(lft)-1);
                    left++;
                }
            window = Math.min(window, right - left + 1);
        }
        System.out.println(window);
    }
    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";

        minimumWindowSubstring(s, t);
    }
}
