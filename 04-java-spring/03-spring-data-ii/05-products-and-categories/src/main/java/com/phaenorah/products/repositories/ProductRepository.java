package com.phaenorah.products.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.phaenorah.products.models.Category;
import com.phaenorah.products.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
	List<Product> findAllByCategoriesEquals(Category category);
    List<Product> findByCategoriesNotContains(Category category);

}
