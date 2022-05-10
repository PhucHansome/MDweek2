package week1.Java.MD2week2.Demo.Enum;

import week1.Java.MD2week2.Demo.linkedlist.Main;

public class Test {
    enum Season{
        SPRING, SUMMER, FALL, WINTER
    }

    public static void main(String[] args) {
        Season season = Season.WINTER;
        System.out.println(season);
    }
}

