package week1.Java.MD2week1.ArrayJV;

public class findMinimumMultiArray {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 7, 6, 7, 8, 8},
                {5, 7, 9, 4, 20, 8},
                {6, 3, 6, 7, 9, 2},
                {7, 5, 6, 8, 5, 21}
        };
        int min = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        System.out.print(min);


    }
}
