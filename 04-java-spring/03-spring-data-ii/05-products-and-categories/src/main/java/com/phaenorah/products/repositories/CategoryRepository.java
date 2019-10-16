package com.phaenorah.products.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.phaenorah.products.models.Category;
import com.phaenorah.products.models.Product;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>{
	List<Category> findAllByProductsNot(Product product);
    List<Category> findByProducts(Product product);
    List<Category> findByProductsNot(Product product);
    List<Category> findByProductsNotContains(Product product);

}
