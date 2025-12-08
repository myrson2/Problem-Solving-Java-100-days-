/*
Day 24 → Sliding Window + Subarray Sum / Product

Focus:

Handling subarrays with constraints

Using sliding window to compute sums or products efficiently

Optimizing with two pointers instead of nested loops

Challenge:

Problem: Maximum Product of Subarray of Size K

Given an integer array nums and an integer k, find the maximum product of any contiguous subarray of size k.
 */
public class day24 {
    static int maxProductOfSubarray(int[] nums, int k){
        int left = 0, right, product = 1, output = 0;

        for(right = 0; right < nums.length; right++){
            product *= nums[right];
            
            while(right - left + 1 > k){
                product /= nums[left];
                left++;
            }
            
            if(right - left + 1 == k) output = Math.max(output, product);
        }
        return output;
    }
    public static void main(String[] args) {
        int[] nums = {1, 5, 2, 3, 7};
        int k = 3;

        System.out.println(maxProductOfSubarray(nums, k));
    }
}
