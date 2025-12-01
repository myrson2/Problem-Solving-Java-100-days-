// DAY 4 CHALLENGE: Palindrome Checker (with normalization)
import java.util.Scanner;

public class day4 {
    static boolean isPalindrome(String str){
        String store_str = str, reversed_str = "";
        char[] char_str = str.toCharArray();

        for (int i = char_str.length-1; i >= 0 ; i--) {
            reversed_str = reversed_str + char_str[i];
        }

        return store_str.equals(reversed_str);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("====== Palindrome Checker ======");

        System.out.print("Enter a String: ");
        String str = scan.nextLine();

        boolean result = isPalindrome(str);

        System.out.println(result);
        scan.close();
    }
}
