// Count how many subarrays are strictly increasing
public class day8 {
    static int increasingArrays(int[] array){
        int length = array.length, count = 0;

        for (int i = 0; i < length; i++) {
            for (int j = i; j < length-1; j++) {
                if(!(array[j] <= array[j+1])) break;
                count++;
            }
        }

        return count + length;
    }

    // 1, 2 count++
    // 1, 2, 3 count++
    // 2, 3 count++
    // 2, 3 count++
    // 2, 3, 4 count++
    // 3, 4  count++
    // total = array.length + count

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 2, 3, 4};

        System.out.println(increasingArrays(arr));
    }
}
