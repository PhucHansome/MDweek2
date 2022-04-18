package week1.Java.MD2week1.demo;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 4, 1, 10, 9, 7};
        System.out.println("mảng chưa sắp xếp");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("mảng đã được sắp xếp");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t ");
        }

    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1 + i; j < n ; j++) {
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}


