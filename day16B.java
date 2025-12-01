public class day16B {
    static boolean isPalindrome(String s){
        int left = 0,
        right = 0,
        length = s.length();

        for(right = length-1; right >= (length-1)/2; right--){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
        }
        return true;
     }
    public static void main(String[] args) {
        String input = "abcba";

        System.out.println(isPalindrome(input));
    }
}
