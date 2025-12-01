// count how many pairs in the array have a difference of “k”.
public class day6 {
    static int countPairsWithDifference(int[] arr, int k){
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (Math.abs(arr[i] - arr[j]) == k) {
                    System.out.printf("-> (%d, %d)\n", arr[i], arr[j]);
                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 2};
        int k = 2;

        System.out.println("Output: " + countPairsWithDifference(arr, k));
    }
}
