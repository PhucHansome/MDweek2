package week1.Java.MD2week1.LoopJV.demo;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        by5();
    }
        public static void by5(){
        int n;
    Scanner scanner = new Scanner(System.in);
    do {
        System.out.print("nhập vào số phần tử của mảng: ");
        n = scanner.nextInt();
    } while ( n <= 0);
    int[] arr = new int[n];

        System.out.println("nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử thứ " + i + " : ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Các phần tử chia hết cho 5 là: ");

        for (int i = 0; i < n; i++) {
            if (arr[i] % 5 == 0) {
                System.out.print(arr[i] + "\n");
            }
        }
    }
}
