package week1.Java.MD2week2.Demo.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class ArrayQueue {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("abc");
        queue.offer("abcc");
        queue.offer("abccc");
        System.out.println("Queue: " + queue);

        String abc = queue.peek();
        System.out.println("Phần tử đẩu tiên: " + abc);

        String def = queue.poll();
        System.out.println("Loại bỏ phần tử: " + def);
        System.out.println("update: " + queue);

        Queue<Integer> integers = new ArrayDeque<>();
        integers.offer(4);
        integers.offer(5);
        integers.offer(6);
        integers.offer(7);
        integers.offer(9);
        integers.offer(10);
        System.out.println(integers);

    }
}
