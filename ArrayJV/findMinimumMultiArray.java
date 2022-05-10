package MD22.Java.MD2week1.ArrayJV;

import java.util.Scanner;

public class findMinimumMultiArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử mảng : ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử của thứ " + i + " của mảng trên :");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
//        int[][] arr = {
//                {5, 7, 6, 7, 8, 8},
//                {5, 7, 9, 4, 20, 8},
//                {6, 3, 6, 7, 9, 2},
//                {7, 5, 6, 8, 5, 21}
//        };
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.print("Giá trị nhỏ nhất là " + min);
    }
}
