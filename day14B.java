//Longest SubArray With At Most K Zeros(Sliding window)
public class day14B {
    static int longestOnesAfterFlips(int[] num, int k){
        int left = 0, 
        zeroCount = 0, 
        right = 0, 
        maxLength = 0;
        
        for (right = 0; right < num.length; right++) {
            if(num[right] == 0) zeroCount++;
            while(zeroCount > k){
                if(num[left] == 0) zeroCount--;
                left++;
            }
            int windowLength = right - left + 1;
            if(windowLength > maxLength) maxLength = windowLength;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] array = {1, 0, 1, 1, 0, 0, 1};
        int k = 2;

        System.out.println(longestOnesAfterFlips(array, k));
    }
}
