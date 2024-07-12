package com.alibou.coding.mongodemo.category.repository;

import com.alibou.coding.mongodemo.category.entity.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String > {
}
