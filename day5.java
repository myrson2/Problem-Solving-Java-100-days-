// DAY 5 CHALLENGE: String Compression
import java.util.Scanner;

public class day5 {
    static String compressString(String str){
        String newStr = "";
        char[] input = str.toCharArray();
        char start, c_count;

        int count = 1, i = 0;

        start = input[i];
        
        for (i = 0; i < input.length-1; i++) {
            if(start == input[i+1]){ 
                count++; // increment as long as it always true
            } else { //if it encounters different value
                c_count = String.valueOf(count).charAt(0); // converting count to char(c_count)
                newStr = newStr + start; // char start to string
                newStr = newStr + c_count; // after start then add c_count 

                count = 1; // set back to 1 again
            }
            start = input[i+1]; // assign that different value to validate in the loop again
        }

        start = input[input.length - 1]; // accessing the last element

         // add assuming that the last element in the loop not iterated, automatically count is 1
        newStr = newStr + start;
        newStr = newStr + count;

        return newStr; // return result to the main method

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter any String: ");
        String input = scan.nextLine();

        System.out.println(compressString(input));

        scan.close();
    }
}
