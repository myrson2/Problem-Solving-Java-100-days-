// Find the length of the Longest Increasing Continuous Sequence in an array

public class day7 {
    static int longestIncreasingContinuousSeq(int[] arr){
        int count = 1, store = 0;

        for (int i = 0; i < arr.length-1; i++) {
           
            if(!(arr[i] < arr[i+1])){
                if(count > store) store = count;
                count = 1;
            } else {
                count++;
            }
        }

        if(count > store) store = count;

        return store;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 4, 5, 1};

        System.out.println(longestIncreasingContinuousSeq(arr));
    }
}
