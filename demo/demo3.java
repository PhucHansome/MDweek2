package week1.Java.MD2week1.demo;

public class demo3 {
    public static void main(String[] args) {
        int myarray[] = {5, 6, 7, 10, 9, 8, 1, 4};
        // đưa mảng array trên thành chuỗi
        System.out.println("Array on which we apply bubble sort: ");
        for (int i = 0; i < myarray.length; i++) {
            System.out.print(myarray[i] + " ");
        }
        System.out.println();
        //in ra mảng tăng dần
        bubbleSort(myarray);
        System.out.println("Array after apply Bubble sort: ");
        for (int i = 0; i < myarray.length; i++) {
            System.out.print(myarray[i] + " ");
        }
    }

    static void bubbleSort(int[] myarray) {
        int n = myarray.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (myarray[j - 1] > myarray[j]) {
                    temp = myarray[j - 1];
                    myarray[j - 1] = myarray[j];
                    myarray[j] = temp;
                }
            }
        }
    }

}
