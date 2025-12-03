import java.util.HashMap;

public class day20 {
    static boolean checkAnagramWithRules(String s, String t){
        if(s.length() != t.length()) return false;
        
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for (char c : s.toLowerCase().toCharArray()) {
            if(Character.isLetterOrDigit(c)) str1.append(c);
        }
        for (char c : t.toLowerCase().toCharArray()) {
            if(Character.isLetterOrDigit(c)) str2.append(c);
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();


        for (int i = 0; i < str1.length(); i++) {
            map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
        }

        for (int i = 0; i < str2.length(); i++) {
            map2.put(str2.charAt(i), map2.getOrDefault(str2.charAt(i), 0) + 1);
        }

        return map1.equals(map2);
     }
    public static void main(String[] args) {
        String s = "Dormitory!!";
        String t = "Dirty Room.";

        System.out.println(checkAnagramWithRules(s, t));
    }
}
