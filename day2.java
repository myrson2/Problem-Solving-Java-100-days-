//DAY 2 Problem (Arrays Logic | No HashMap)
public class day2 {
    static int countUnique(int[] arr){
        int point, count = 0, unique = 0;
        int[] visited = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            point = arr[i];
            if(visited[i] == 1) continue;

            for (int j = i; j < arr.length; j++) {
                if(point == arr[j]){
                    visited[j] = 1;
                    count++;
                }
            }

            if(count == 1){
                unique++;
            }
            count = 0;
        }

        return unique;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};

        System.out.println(countUnique(array));
    }
}
