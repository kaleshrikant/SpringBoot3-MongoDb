package com.alibou.coding.mongodemo.product.controller;

import com.alibou.coding.mongodemo.product.entity.Product;
import com.alibou.coding.mongodemo.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/product")
    public ResponseEntity<String> saveProduct(
         @RequestBody Product product
    ) {
        return ResponseEntity.ok(productService.save(product));
    }

    @GetMapping("/product")
    public ResponseEntity<List<Product>> findAllProducts() {
        return ResponseEntity.ok(productService.findAllProducts());
    }

    @GetMapping("/product/{product-id}")
    public ResponseEntity<Product> findProductById(
            @PathVariable("product-id") String productId
    ) {
        return ResponseEntity.ok(productService.findByPrductId(productId));
    }

    @DeleteMapping("/product/{product-id}")
    public ResponseEntity<Void> deleteProductById(
            @PathVariable("product-id") String productId
    ) {
        productService.deleteProduct(productId);
        return ResponseEntity.accepted().build();
    }

}
