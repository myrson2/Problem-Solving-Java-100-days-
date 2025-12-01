// DAY 3 Problem (next step / sequence + condition)
public class day3 {
    static int countIncreasingPairs(int[] arr){
        int countPair = 0, i = 0, j = 0;

        for (i = 0; i < arr.length - 1; i++) {
            for (j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    countPair++;
                    System.out.printf("%d < %d\n", arr[i], arr[j]);
                }
            }
        }
        return countPair;
    }

    public static void main(String[] args) {
        int[] array = {3, 1, 4, 2};

        System.out.println("Answer: " + countIncreasingPairs(array));
    }
}
