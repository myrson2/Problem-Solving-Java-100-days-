// PROBLEM: Highest Frequency Number
public class day1 {
    static int highestFrequency(int[] arr){
        int low, count = 0, storeCount = 0, initialHigh = 0;
        boolean[] isVisited = new boolean[arr.length];
        
        int i = 0;
        for(i = 0; i < arr.length; i++) {
            low = arr[i];
            if(isVisited[i]) continue;

            for(int j = i; j < arr.length; j++){
                    if(low == arr[j]){
                        count++;
                        isVisited[j] = true;
                    }
                }
            
            if(count > storeCount){
                storeCount = count;
                initialHigh = low;
            } else if(count == storeCount && low < initialHigh){
                initialHigh = low;
            }

            count = 0;
        }
        return initialHigh;
    }
    public static void main(String[]args){
        int[] arr = {10, 20, 10, 30, 20, 20, 40, 10};

        System.out.println(highestFrequency(arr));
    }
}