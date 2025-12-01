import java.util.HashMap;

public class day18 {
    static boolean checkifTwoStringsAreAnagrams(String str1, String str2){
        HashMap<Character, Integer> string1 = new HashMap<>();
        HashMap<Character, Integer> string2 = new HashMap<>();

        if(str1.length() != str2.length()) return false;

        String s = str1.toLowerCase();
        String t = str2.toLowerCase();

        for(int i = 0; i < str1.length(); i++){
            char c = s.charAt(i);
            string1.put(c, string1.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < str2.length(); i++){
            char c = t.charAt(i);
            string2.put(c, string2.getOrDefault(c, 0) + 1);
        }

        return string1.equals(string2);
    }
    public static void main(String[] args) {
        String s1 = "hel lo";
        String s2 = "HeLlo";

        System.out.println(checkifTwoStringsAreAnagrams(
            s1.replace(" ", ""), 
            s2.replace(" ", ""))
        );
    }
}
