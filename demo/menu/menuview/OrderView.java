package week1.Java.MD2week1.demo.menu.menuview;

import java.util.Scanner;

public class OrderView {
    public static Scanner scanner = new Scanner(System.in);

    public static void run(){
        boolean is = false;
        do {
            Menu.orderMenu();
            System.out.println("\n Chọn chức năng");
            System.out.print("☛ ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    OrderView.run();
                    break;
                case 2:
                    OrderView.run();
                    break;
                case 3:
                    Menu.lauchMainMenu();
                    break;
                default:
                    OrderView.run();
                    break;
            }
        } while (!is);
    }
}
