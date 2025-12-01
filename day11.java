// Move All Even Numbers to the Front
public class day11 {

    static void moveOddstoEnd(int[] arr) {
        int pos = 0; 

        for (int i = 0; i < arr.length; i++) {
            boolean isOdd = arr[i] % 2 == 1;
            if (!isOdd) {
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos++;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 12, 7, 4};
        moveOddstoEnd(arr);
    }
}
