package com.alibou.coding.mongodemo;

import com.alibou.coding.mongodemo.category.entity.Category;
import com.alibou.coding.mongodemo.category.repository.CategoryRepository;
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
	public CommandLineRunner commandLineRunner(
			ProductRepository productRepository,
			CategoryRepository categoryRepository
	) {
		return args -> {

			var category1 = Category.builder()
					.name("CAT#1")
					.description("CAT#1 description")
					.build();

			var category2 = Category.builder()
					.name("CAT#2")
					.description("CAT#2 description")
					.build();
			categoryRepository.insert(category1);
			categoryRepository.insert(category2);


			var product = Product.builder()
					.name("Laptop")
					.description("ThinkPad")
					.build();
			// productRepository.insert(product);
		};
	}
}
