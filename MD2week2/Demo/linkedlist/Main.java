package week1.Java.MD2week2.Demo.linkedlist;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("obj 1");
        names.add("obj h");
        names.add("obj kk");
        System.out.println(names);
        names.add(1, "Jay2");
        System.out.println(names);
        names.addFirst("Urgot");
        names.addLast("Qiyana");
        System.out.println(names);

        for(String ob : names){
            System.out.println(ob);
        }
        System.out.println(names.get(3));
        System.out.println(names.set(2, "Phuc Awesome"));
        System.out.println(names);
        System.out.println("Xóa");
        names.remove(2);
        System.out.println(names);
        names.push("Alo");
        System.out.println(names);
        names.pop();
        System.out.println(names);
        System.out.println(names.size());
    }

}


