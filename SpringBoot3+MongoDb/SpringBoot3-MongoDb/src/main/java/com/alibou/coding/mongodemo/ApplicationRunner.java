package com.alibou.coding.mongodemo;

import com.alibou.coding.mongodemo.product.entity.Product;
import com.alibou.coding.mongodemo.product.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationRunner.class, args);
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
