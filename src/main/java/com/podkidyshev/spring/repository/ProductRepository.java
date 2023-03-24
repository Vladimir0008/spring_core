package com.podkidyshev.spring.repository;

import com.podkidyshev.spring.Product;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private List<Product> products;

    public ProductRepository() {
        products = new ArrayList<>();
        products.add(new Product(1, "Bread", new BigDecimal(10.0)));
        products.add(new Product(2, "Beer", new BigDecimal(20.0)));
        products.add(new Product(3, "Pelmeni", new BigDecimal(30.0)));
        products.add(new Product(4, "Souce", new BigDecimal(15.0)));
        products.add(new Product(5, "Whisky", new BigDecimal(200.0)));
        products.add(new Product(6, "Chips", new BigDecimal(25.0)));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "ProductRepository{" +
                "products=" + products +
                '}';
    }
}
