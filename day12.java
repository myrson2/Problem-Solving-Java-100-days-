// Remove Duplicates From an Array (Keep First Occurrence)

import java.util.ArrayList;

public class day12 {
    static void removeDuplicates(int[] arr){
        ArrayList<Integer> newArray = new ArrayList<>();
        boolean[] isVisited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if(isVisited[i]) continue;
            int current = arr[i];
                for (int j = i; j < arr.length; j++) {
                    if(current == arr[j]) isVisited[j] = true;
                }
                newArray.add(current);
        }

        for (int i : newArray) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 3};

        removeDuplicates(arr);
    }
}
