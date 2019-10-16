package com.phaenorah.products.services;

import com.phaenorah.products.models.Category;
import com.phaenorah.products.models.Product;
import com.phaenorah.products.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
	CategoryRepository categoryRepo;
    public CategoryService(CategoryRepository categoryRepo){
        this.categoryRepo = categoryRepo;
    }
    public void createCategory(Category category){
        categoryRepo.save(category);
    }
    public Category getCategory(Long id){
        return categoryRepo.findById(id).orElse(null);
    }
    public Iterable<Category> availableCategoriesForProduct(Product product){
        return categoryRepo.findByProductsNotContains(product);
    }

}
