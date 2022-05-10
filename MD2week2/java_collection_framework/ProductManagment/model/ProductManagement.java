package week1.Java.MD2week2.java_collection_framework.ProductManagment.model;

import week1.Java.MD2week2.java_collection_framework.ProductManagment.sortAndSearch.Search;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManagement {
    static Scanner scanner = new Scanner(System.in);
//    private  Sort sort = new Sort();

    public static void showMenu() {
        System.out.println("------------Product-Manager------------");
        System.out.println("          1. Add product.              ");
        System.out.println("          2. Edit product.             ");
        System.out.println("          3. Remove product.           ");
        System.out.println("          4. Display products.         ");
        System.out.println("          5. Search products.          ");
        System.out.println("          6. Quit.                     ");
        System.out.println("---------------------------------------");
    }

    private final ArrayList<Product> products = new ArrayList<>();

    public void productManager() {
        products.add(new Product(11111, "Omo", 50, 1000));
        products.add(new Product(11112, "H&S", 22, 323200));
        products.add(new Product(22223, "M&M", 10, 2320));
        products.add(new Product(33332, "Wew", 3, 450000));
        products.add(new Product(15000, "Tesla", 88, 9500000));
    }

    public void renderProduct() {
        System.out.printf("%-20s %-20s -20s -20s \n", "ID", "Product", "Quantity", "Price");
        System.out.println("----------------------------------------------------------------");
        for (Product product : products) {
            System.out.printf("%-20s %-20s %-20s %-20f\n", product.getId(), product.getName(), product.getQuantity(), product.getPrice());
        }
    }

    public void addProduct() {
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Price: ");
        double price = Double.parseDouble(scanner.nextLine());

        products.add(0, new Product(name, quantity, price));
        System.out.println("Item added successfully!");
    }

    public void removeProduct() {
        renderProduct();
        System.out.println("Delete by ID:");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                products.remove(i);
                break;
            }
        }
        System.out.println("Items Remove successfully  ");
    }

    public void displayProduct() {
        int choice;
        do {
            renderProduct();
            System.out.println("1. Sort by ID (Ascending).");
            System.out.println("2. Sort by ID (Descending)");
            System.out.println("3. Sort by Name (Ascending).");
            System.out.println("4. Sort by Name (Descending)");
            System.out.println("5. Sort by Quantity (Ascending).");
            System.out.println("6. Sort by Quantity (Descending)");
            System.out.println("7. Sort by Price (Ascending).");
            System.out.println("8. Sort by Price (Descending)");
            System.out.println("9. Return.");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    products.sort(Comparator.comparing(Product::getId));
                    break;
                case 2:
                    products.sort(Comparator.comparing(Product::getId).reversed());
                    break;
                case 3:
//                    products.sort((Comparator<? super Product>) new Sort());
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
            }
        } while (choice != 9);
    }

    public void editProduct() {
        renderProduct();
        System.out.println("Search Id:");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                System.out.println("New name: ");
                String newName = scanner.nextLine();
                System.out.println("New quantity: ");
                int newQuantity = Integer.parseInt(scanner.nextLine());
                System.out.println("New price: ");
                double newPrice = Double.parseDouble(scanner.nextLine());

                products.set(i, new Product(products.get(i).getId(), newName, newQuantity, newPrice));
                break;
            }
        }
        System.out.println("Items Edited successfully");
    }

    public void searchProduct() {
        renderProduct();
        Search.searchByName();
    }
}
