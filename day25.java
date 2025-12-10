/*
🔥 Day 25 – Advanced Sliding Window Challenge
Problem Title

Count Subarrays Where Product < K

Problem Statement

Given an array of positive integers nums and an integer k, return the number of contiguous subarrays where the product of all elements is strictly less than k. */
public class day25 {
    static int numSubarrayProductLessThanK(int[] nums, int k){
        int left = 0, right, count = 0, product = 1;

            for(right = 0; right < nums.length; right++){
                product *= nums[right];

                while(product >= k){
                    product /= nums[left];
                    left++;
                }

                int window = right - left + 1;
                count += window;
            }

        return count;
    }

    public static void main(String[] args) {
        int[] array = {10, 5, 2, 6, 3, 8};
        int k = 100;

        System.out.println(numSubarrayProductLessThanK(array, k));
    }
}
