import java.util.HashMap;

public class day22 {
    static int longestSubstringOneDuplicateAllowed(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxLength = 0, dupe = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);
            
            if(map.get(c) == 2) dupe++;
            
            while(dupe > 1){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar)-1);
                if(map.get(leftChar) == 1) dupe--; 
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String input = "aabbbc";

        System.out.println(longestSubstringOneDuplicateAllowed(input));
    }
}
