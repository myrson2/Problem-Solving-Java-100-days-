public class day9 {
    static int maxSubarraySum(int[] arr, int k){
        int sum, storeSum = 0, count = 0;

        for (int i = 0; i < arr.length-k; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {
                if(count == k) break;

                sum += arr[j];
                count++;
            }
            if(sum > storeSum){
                storeSum = sum;
            }
            count = 0;
        }
        return storeSum;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 7, 8, 1, 2, 8, 1, 0};
        int k = 3;

       System.out.println(maxSubarraySum(arr, k));
    }
}
