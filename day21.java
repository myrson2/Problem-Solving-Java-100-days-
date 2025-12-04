import java.util.HashMap;

public class day21 {
    static boolean isIsomorphic(String s, String t){
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        if(s.length() != t.length()) return false;

        int length = s.length();
        
        for (int i = 0; i < length; i++) {
            char sChar = s.charAt(i), 
            tChar = t.charAt(i);

            if(!map1.containsKey(sChar)){
                map1.put(sChar, tChar);
            } else if (map1.get(sChar) != tChar){
                return false;
            }

            if(!map2.containsKey(tChar)){
                map2.put(tChar, sChar);
            } else if (map2.get(tChar) != sChar){
                return false;
            }
        }
        return true;   
    }
    public static void main(String[] args) {
        String s = "ab";
        String t = "cc";

        System.out.println(isIsomorphic(s.toLowerCase(), t.toLowerCase()));
    }
}
