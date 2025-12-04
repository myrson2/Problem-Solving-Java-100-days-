//Day 17C — Longest Substring With No More Than Two Repeating Characters

public class day17C {
    static int lengthOfSubstringMaxTwoRepeats(String s){
        int left = 0, maxLength = 0, consecutiveLimit = 0;
        char prev = ' ';

        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);

            if(prev ==  c){
                consecutiveLimit++;
            } else {
                consecutiveLimit = 1;
                prev = c;
            }

            if(consecutiveLimit > 2){
                left++;
                consecutiveLimit--;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
    public static void main(String[] args) {

        String input = "aaabbccdee";
        
        System.out.println(lengthOfSubstringMaxTwoRepeats(input));
    }
}
