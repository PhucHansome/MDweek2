package Java;

import java.util.Scanner;

public class DisplayTypes {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 2:
                    System.out.println("Draw the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right) ");

                    for (int i = 1; i < 6; i++) {
                        for (int j = 1; j <= i ; j++ ){
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Draw the isosceles triangle");
                    for(int i = 1; i <= 6 ; i++ ) {
                        for (int j = 1; j <= 6 - i ; j++ ){
                            System.out.printf(" ");
                        }
                        for (int j = 1; j <= 2 * i - 1 ; j++){
                            System.out.printf("*");
                        }
                        System.out.printf("\n");
                }
                case 4:
                    System.out.println(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
