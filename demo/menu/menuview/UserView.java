package week1.Java.MD2week1.demo.menu.menuview;

import java.util.Scanner;

public class UserView {
    public static Scanner scanner = new Scanner(System.in);

    public static void run() {
        boolean is = false;
        do {
            Menu.userMenu();
            System.out.println("\n chọn chức năng");
            System.out.print("☛ ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    UserView.run();
                    break;
                case 2:
                    UserView.run();
                    break;
                case 3:
                    UserView.run();
                    break;
                case 4:
                    Menu.lauchMainMenu();
                    break;
                default:
                    UserView.run();
                    is = true;
                    break;
            }
        } while (!is);

    }
}
