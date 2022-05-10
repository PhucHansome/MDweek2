package week1.Java.MD2week2.DSADanhSach.exercise_implementeer_die_metode_linkedlist;

import java.util.List;

public class MyLinkedListTest {

        public static void main(String[] args) {
            MyLinkedList list = new MyLinkedList(1);
            list.add(1, 2);
            list.add(2,"Melinda");
            list.add(3,4);
            list.add(4,5);
            list.addFirst(0);

            System.out.println(list.printList());
        }

}
