package com.phaenorah.products.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.phaenorah.products.models.Category;
import com.phaenorah.products.models.Product;
import com.phaenorah.products.repositories.ProductRepository;

@Service
public class ProductService {
	ProductRepository productRepo;
    public ProductService(ProductRepository productRepo){
        this.productRepo = productRepo;
    }
    public void createProduct(Product product){
        productRepo.save(product);
    }
    public List<Product> getByCategory(Category category){
        return productRepo.findAllByCategoriesEquals(category);
    }
    public Product getProduct(Long id){
        return productRepo.findById(id).orElse(null);
    }
    public Iterable<Product> availableProductsForCategory(Category category){
        return productRepo.findByCategoriesNotContains(category);
    }

}
