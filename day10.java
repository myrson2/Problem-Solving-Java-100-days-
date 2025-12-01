public class day10 {
    static void printPairsWithSum(int[] arr, int target){

        for (int i = 0; i < arr.length-1; i++) {
           for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    System.out.printf("(%d, %d)\n", arr[i], arr[j]);
                }
           }
        }
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 3};
        int target = 6;

        printPairsWithSum(arr, target);
    }
}
