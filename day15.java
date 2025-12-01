// Maximum Sum of SubArray of Size K with At Most One Negative Number
public class day15 {
    static int maxSumSubArrayWithAtMostOneNegative(int[] num, int k){
        int left = 0,
        maxSum = 0, sum = 0, negative = 0;
        
        for (int right = 0; right < num.length; right++) {
             sum += num[right];
            if(num[right] < 0) negative++;
        
             while(negative > 1 || (right - left + 1) > k){
                if(num[left] < 0) negative--;
                sum -= num[left];
                left++;
            }

            if((right - left + 1) <= k) if(sum > maxSum) maxSum = sum;
        }
        return maxSum;
    }

   
    public static void main(String[] args) {
        int[] num = {2, -1, 3, 4, -2, 5, 1};
        int k = 3;

        System.out.println(maxSumSubArrayWithAtMostOneNegative(num, k));
    }
}
