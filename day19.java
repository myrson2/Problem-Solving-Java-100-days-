//Problem: First Unique Character in a String

import java.util.HashMap;

public class day19 {
    static int firstUniqueCharacterInAString(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        int storeIndex = -1;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

         for (int j = 0; j < str.length(); j++) {
                if(map.getOrDefault(str.charAt(j), 0) == 1){
                    storeIndex = j;
                    break;
                } 
           }
        
        return storeIndex;
    }
    public static void main(String[] args) {
        String input = "aabbcc";

        System.out.println(firstUniqueCharacterInAString(input.toLowerCase()));;
    }
}