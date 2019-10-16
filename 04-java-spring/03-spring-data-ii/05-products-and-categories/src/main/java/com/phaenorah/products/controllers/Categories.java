package com.phaenorah.products.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.phaenorah.products.models.Category;
import com.phaenorah.products.models.Product;
import com.phaenorah.products.services.CategoryService;
import com.phaenorah.products.services.ProductService;

@Controller
@RequestMapping("/categories")
public class Categories {
	CategoryService categoryService;
	ProductService productService;
	public Categories(CategoryService categoryService, ProductService productService){
        this.categoryService = categoryService;
        this.productService = productService;
    }
	@RequestMapping("/new")
    public String newCategoryPage(@ModelAttribute Category category){
        return "/views/newCategory.jsp";
    }
	@PostMapping("/new")
    public String createCategory(@Valid @ModelAttribute("category") Category category, BindingResult result){
        if(result.hasErrors()){
            return "/views/newCategory.jsp";
        }else{
            categoryService.createCategory(category);
            return "redirect:/categories/"+category.getId();
        }
    }
	@RequestMapping("/{id}")
    public String getCategory(@PathVariable("id") Long id, Model model){        
        Category category = categoryService.getCategory(id);
        //find products by category
        //add to model

        //model.addAttribute("products", products);
        Iterable<Product> products = productService.availableProductsForCategory(category);
        model.addAttribute("category", category);
        model.addAttribute("products", products);
        return "/views/category.jsp";
    }
	@PostMapping("/addproduct")
    public String addProduct(@RequestParam("categoryId") Long catId, @RequestParam("productVal") Long productId){
        Product product = productService.getProduct(productId);
        Category category = categoryService.getCategory(catId);
        List<Product> products = category.getProducts();
        products.add(product);
        category.setProducts(products);
        categoryService.createCategory(category);
        return "redirect:/categories/"+category.getId();
    }

}
