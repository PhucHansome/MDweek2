package MD22.Java.MD2week1.ArrayJV;

import java.util.Arrays;
import java.util.Scanner;

public class totalColum {
    public static void main(String[] args) {
        int size;
        double element;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kich thước của mảng 2 chiều : ");
        size = Integer.parseInt(scanner.nextLine());

        double[][] arr = new double[size][size];
        for (int i = 0 ; i < size; i++) {
            for (int j = 0; j < size ; j++) {
                System.out.println("Nhập phần tử thứ " + i + j + ": ");
                element = Double.parseDouble(scanner.nextLine());
                arr[i][j] = element;
            }
        }
        System.out.println(Arrays.deepToString(arr));

        for (int i = 0;  i  < size ; i++ ){
            double sum = 0;
            for (int j = 0; j < size ; j++) {
                sum += arr[j][i];
                System.out.println(arr[j][i]);
            }
            System.out.printf("%s%d%s.2f%n", "Tổng các phần tử ở cột" , (i + 1) , " là: ", sum);
        }
    }
}
