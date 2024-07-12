package com.alibou.coding.mongodemo;

import com.alibou.coding.mongodemo.product.Product;
import com.alibou.coding.mongodemo.product.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ProductRepository productRepository) {
		return args -> {
			var product = Product.builder()
					.name("Laptop")
					.description("ThinkPad")
					.build();
			productRepository.insert(product);
		};
	}
}
