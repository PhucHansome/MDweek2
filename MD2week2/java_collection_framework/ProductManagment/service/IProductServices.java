package week1.Java.MD2week2.java_collection_framework.ProductManagment.service;

import week1.Java.MD2week2.java_collection_framework.ProductManagment.model.Product;

import java.util.List;

public interface IProductServices {
    List<Product> getProducts();
    void addProduct(Product newProduct);
    Product getByProductId(long productId);
    boolean existById(long productId);
    void update(Product product);
    void removeById(long productId);
}
