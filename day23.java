// Day 23 — Challenge #3 (Sliding Window – Frequency Map – Harder Logic)
// Return the length of the longest substring that can be made to contain all repeating letters.

import java.util.HashMap;

public class day23 {
    static int characterReplacement(String s, int k){
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, right, window = 0, maxFreq = 0;

        for(right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            
            map.put(c, map.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(c));
           
            while((right - left + 1)  - maxFreq > k){
                char l = s.charAt(left);
                map.put(l, map.get(l) - 1);
                left++;
            }

            window = Math.max(window, right - left + 1);
        }

        return window;
    }

    

    public static void main(String[] args) {
        String input = "AABABBA";
        int k = 1;

        System.out.println(characterReplacement(input, k));
    }
}
