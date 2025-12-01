import java.util.HashMap;

public class day17B {
    static int lengthOfLongestSubstringKDistinct(String str, int k){
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < str.length(); right++) {
            char c = str.charAt(right);

            // Add character count
            map.put(c, map.getOrDefault(c, 0) + 1);

            // Shrink window if too many distinct chars
            while(map.size() > k){
                char leftChar = str.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);

                if(map.get(leftChar) == 0){
                    map.remove(leftChar);
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input = "eceba";
        int k = 2;

        System.out.println(lengthOfLongestSubstringKDistinct(input, k));
    }
}
