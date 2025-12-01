//Day 17C — Longest Substring With No More Than Two Repeating Characters

import java.util.HashMap;

public class day17C {
    static int lengthOfSubstringMaxTwoRepeats(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxLength = 0, consecutiveLimit = 2;

        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
    }
    public static void main(String[] args) {

        String input = "aaabbccdee";
        
        System.out.println(lengthOfSubstringMaxTwoRepeats(input));
    }
}
