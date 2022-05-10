package week1.Java.MD2week2.java_collection_framework.ProductManagment.sortAndSearch;

import java.util.Scanner;

import static week1.Java.MD2week2.java_collection_framework.ProductManagment.service.ProductServices.products;

public class Search {
    static Scanner input = new Scanner(System.in);

    public static void searchByName() {
        System.out.println("Enter name product: ");
        String name = input.nextLine().toLowerCase();

        int count = 0;
        for (int i = 0; i < products.size(); i++) {
            if ((products.get(i).getName().toLowerCase().contains(name))) {

                System.out.println("------------------------------------------------------------------------------------------------------");
                System.out.printf("%-1s %-20s %-20s %-20s %-20s\n", "", products.get(i).getId(), products.get(i).getName(), products.get(i).getQuantity(), products.get(i).getPrice());
                count++;
            }
        }
        System.out.println("---------------------------------------------------------------------------------------------------------");
        if(count == 0){
            System.out.println("not found!");
        }
    }
}
