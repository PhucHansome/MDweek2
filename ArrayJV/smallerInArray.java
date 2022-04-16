package week1.Java.MD2week1.ArrayJV;

import java.util.Arrays;
import java.util.Scanner;

public class smallerInArray {
    public static void main(String[] args) {
        System.out.println("Nhập phần tử của mảng: ");
        Scanner scanner = new Scanner(System.in);
        int size = 5;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Phân tử min trong arr là: ");
        System.out.print(Arrays.toString(arr));
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min in array " + min);

    }
}
