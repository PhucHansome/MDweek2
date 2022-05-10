package week1.Java.MD2week2.java_collection_framework.ProductManagment.model;

public class Product {
    private long id;
    private String name;
    private int quantity;
    private double price;

    public Product(String name, int quantity, double price) {
        id = System.currentTimeMillis() %100000;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(long id, String name, int quantity, double price){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
