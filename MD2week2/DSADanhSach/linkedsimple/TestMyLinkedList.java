package week1.Java.MD2week2.DSADanhSach.linkedsimple;

import week1.Java.MD2week2.DSADanhSach.SimpleList.MyList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/=/= TESTING /=/=/=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4, 9);
        ll.add(4, 9);
        ll.printList();
    }
}

