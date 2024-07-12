package com.alibou.coding.mongodemo.product.service;

import com.alibou.coding.mongodemo.product.entity.Product;
import com.alibou.coding.mongodemo.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public String save(Product product) {
        // todo : use a DTO
        // todo : validate the objects
        return productRepository.save(product).getId();
    }

    public Product findByPrductId(String productId) {
        return productRepository.findById(productId).orElse(null);
    }

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    public void deleteProduct(String productId) {
        productRepository.deleteById(productId);
    }
}
