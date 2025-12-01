//longest Sub-array With Sum ≤ K (Sliding window)
public class day14 {
    static int longestSubArrayWithSumAtMostK(int[] num, int k){
        int left = 0, sum = 0, count = 0;
        for (int right = 0; right < num.length-1; right++) {
            sum += num[right];
                while (sum > k){
                    sum -= num[left];
                    left++;
                }
            int windowLength = right - left + 1;
            if(windowLength > count) count = windowLength;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {2, 1, 3, 1, 1, 1, 5};
        int k = 5;

        System.out.println(longestSubArrayWithSumAtMostK(array, k));
    }
}
