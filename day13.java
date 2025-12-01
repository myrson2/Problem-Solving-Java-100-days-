import java.util.HashMap;

public class day13 {
    static boolean containsNearbyDuplicate(int[] num, int k){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < num.length; i++) {     
            System.out.println(map.containsKey(num[i]));   
            // containsKey() -> checks if the key exists
            if(map.containsKey(num[i])){
                // map.get() -> returns the most recent value of that key
                int j = map.get(num[i]); 
                System.out.println(map.get(num[i]) + ", " + i);
                if(i - j <= k) return true;
            }
            map.put(num[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] num = {2,1,3,2,1,3};
        int k = 2;

        System.out.println(containsNearbyDuplicate(num, k));
    }
}
