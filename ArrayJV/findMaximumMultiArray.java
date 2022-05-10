package MD22.Java.MD2week1.ArrayJV;

import java.util.Arrays;
import java.util.Scanner;

public class findMaximumMultiArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, element;
        System.out.println("nhập vào số phần từ cột");
        x = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số phần tử hàng");
        y = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[x][y];
        System.out.println("nhập các phần tử của mang: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++){
                System.out.println("nhập vào phần từ "+ j);
                element = Integer.parseInt(scanner.nextLine());
                arr[i][j] = element;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.print("giá trị lớn nhất là : " + max);


    }
}
