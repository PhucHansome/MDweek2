package Java;

import java.util.Scanner;

public class FirstInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("type a number: ");
        int count = scanner.nextInt();

        if (count < 2){
            System.out.println(count + " the number you just entered is not prime");
        } else {

            for (int j = 2; j <= Math.sqrt(count) ; j ++ ){
                if ( !(count % j == 0) ) {
                    System.out.println("The number is prime");
                }
                if (count % j == 0){
                    System.out.println("the number not is prime");
                }
                j++;
            }
        }

    }
}
