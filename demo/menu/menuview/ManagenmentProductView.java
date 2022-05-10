package week1.Java.MD2week1.demo.menu.menuview;

import java.util.Scanner;

public class ManagenmentProductView {
    public static Scanner scanner = new Scanner(System.in);

    public static void run() {
        boolean is = false;
        do {
            Menu.managementMenu();
            System.out.println("\n chọn chức năng");
            System.out.print("☛ ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    ManagenmentProductView.run();
                    break;
                case 2:
                    ManagenmentProductView.run();
                    break;
                case 3:
                    ManagenmentProductView.run();
                    break;
                case 4:
                    ManagenmentProductView.run();
                    break;
                case 5:
                    Menu.lauchMainMenu();
                    break;
                default:
                    ManagenmentProductView.run();
                    is = true;
            }
        } while (!is);
    }
}
