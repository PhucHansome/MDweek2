package week1.Java.MD2week1.LoopJV.demo;

public class Demo {
    public static void main(String[] args) {
        divFive();
    }

    public static void divFive() {
        System.out.println("Các phần tử chia hết cho 5 là: ");
        int[] arr = {5, 8, 10, 5, 7, 8, 4, 20, 40, 80, 5, 4};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                System.out.print(arr[i] + "\t");
            }
        }
    }
}



