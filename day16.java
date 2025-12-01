// Day 17 Challenge — SubArray Sum Equals K

import java.util.HashMap;

public class day16 {
    static int lengthOfLongestSubstring(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < str.length(); right++) {
            char c = str.charAt(right);
            
            if(map.containsKey(c)){
                while (map.containsKey(c)) {
                    map.remove(str.charAt(left));
                    left++;
                }
            }
            map.put(c, right);  

            int count = right - left + 1; // 1, 2, 3, 
            if(count > maxLength) maxLength = count;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcab";
        
        System.out.println(lengthOfLongestSubstring(input));
    }
}
