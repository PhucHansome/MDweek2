package week1.Java.MD2week2.java_collection_framework.ProductManagment.service;

import week1.Java.MD2week2.java_collection_framework.ProductManagment.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServices implements IProductServices{
    public static List<Product> products = new ArrayList<Product>();

    public ProductServices(){
        products.add(new Product(1000,"omo", 50, 1000));
        products.add(new Product(1001,"P/s", 50, 1000));
        products.add(new Product(1002,"Aquaphina", 50, 1000));
        products.add(new Product(1003,"Oishi", 50, 1000));
        products.add(new Product(1000,"omo", 50, 1000));
        products.add(new Product(1000,"omo", 50, 1000));
        products.add(new Product(1000,"omo", 50, 1000));
        products.add(new Product(1000,"omo", 50, 1000));

    }

    @Override
    public List<Product> getProducts() {
            return products;
    }

    @Override
    public void addProduct(Product newProduct) {
        products.add(newProduct);
    }

    @Override
    public Product getByProductId(long productId) {
        for (Product product: getProducts()){
            if(product.getId() == productId){
                return product;
            }
        }
        return null;
    }

    @Override
    public boolean existById(long productId) {
        return getByProductId(productId) != null;
    }

    @Override
    public void update(Product newProduct) {
        Product product = getByProductId(newProduct.getId());
        product.setName(newProduct.getName());

    }

    @Override
    public void removeById(long productId) {
    }
}
