public class day17{
    static int longestSubArrayWithSumAtMostK(int[] arr, int k){
        int left = 0, maxLength = 0, sum = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while(sum >= k){
                sum -= arr[left];
                left++;
            }

            int slidingWindow = right - left + 1;
            maxLength = Math.max(maxLength, slidingWindow);
        }

        return maxLength;

    }

    public static void main(String[] args) {
        int[] array = {2, 1, 2, 1, 1};
        int k = 3;

        System.out.println(longestSubArrayWithSumAtMostK(array, k));

    }
}