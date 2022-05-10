package MD22.Java.MD2week1.ArrayJV;

import java.util.Arrays;
import java.util.Scanner;

public class sumOfDiagonalNumbers {
    public static void main(String[] args) {
        int size;
        double element;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước của mảng 2 chiều: ");
        size = Integer.parseInt(scanner.nextLine());

        double[][] arr = new double[size][size];
        for (int i = 0 ; i < size ; i++) {
            for (int j = 0 ; j < size ; j++) {
                System.out.print("Nhập phần tử thứ " + i + j + " : ");
                element = Double.parseDouble(scanner.nextLine());
                arr[i][j] = element;
            }
        }
        System.out.println(Arrays.deepToString(arr));

        double sum = 0;
        for(int i = 0; i < size ; i++ ) {
            sum += arr[i][i];
        }
        System.out.println("Tổng của đường chéo chính là : " + sum);
    }
}
