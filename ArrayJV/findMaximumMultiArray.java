package week1.Java.MD2week1.ArrayJV;

public class findMaximumMultiArray {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 7, 6, 7, 8, 8},
                {5, 7, 9, 4, 20, 8},
                {6, 3, 6, 7, 9, 2},
                {7, 5, 6, 8, 5, 21}
        };
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.print(max);


    }
}
