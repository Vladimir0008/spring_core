package com.podkidyshev.spring;

import com.podkidyshev.spring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Cart {

    private ProductRepository productsList;
    private List<Product> products;

    public Cart(ProductRepository productRepository) {
        this.products = new ArrayList<>();
        this.productsList = productRepository;
    }

    public void addProduct(int id) {
        products.add(productsList.getProductById(id));
    }

    public void removeProduct(int id) {
        products.remove(productsList.getProductById(id));
    }

    public List<Product> getProductIds() {
        return products;
    }

    public ProductRepository getProductsList() {
        return productsList;
    }
}
