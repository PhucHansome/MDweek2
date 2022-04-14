package week1.Java.MD2week1.LoopJV.demo;

import java.util.Scanner;




public class Demo {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
    do{
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        sum += number;
    } while (number != 0);
        System.out.println("The sum is: " + sum);
}
}