package MD22.Java.MD2week1.OOPJV.stopwatch;

import java.util.Arrays;
import java.util.Random;

public class main {
    public static double[] selectionSort(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]  > arr[j]) {
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Random random = new Random();
        double[] arr = random.doubles(5,10,50).toArray();
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println(Arrays.toString(selectionSort(arr)));
        stopWatch.stop();
        System.out.println("Time: " + stopWatch.getElapsedTime());
    }
}
