package Java;

//import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        if(number < 2){
            System.out.println(number + " is not a Prime ");
        }
        else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " Is a prime");
            else
                System.out.println(number + " Is a NOT prime");
        }
    }
}
