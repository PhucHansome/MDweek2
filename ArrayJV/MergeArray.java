package week1.Java.MD2week1.ArrayJV;

import java.util.Scanner;

public class MergeArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] a = null;
        int[] b = null;
        int[] c = null;
        System.out.println("----Nhập mảng a----");
        a = input(a);
        System.out.println("----Nhập mảng b----");
        b = input(b);
        c = merge(a,b);
        show(c);
    }

    public static int[] input(int[] arr) {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        arr = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void sortASC(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static int[] merge(int[] a, int[] b) {
        int aIndex = a.length - 1;
        int bIndex = b.length - 1;
        int cIndex = a.length + b.length - 1;
        int[] c = new int[cIndex + 1];

        sortASC(a);
        sortASC(b);
        for (int i = cIndex; i > -1; i--) {
            if (aIndex > -1 && bIndex > -1) {
                if (a[aIndex] > b[bIndex]) {
                    c[i] = a[aIndex--];
                } else {
                    c[i] = b[bIndex--];
                }
            } else if (bIndex == -1) {
                c[i] = a[aIndex--];
            } else if (aIndex == -1) {
                c[i] = b[bIndex--];
            }
        }
        return c;
    }

    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}