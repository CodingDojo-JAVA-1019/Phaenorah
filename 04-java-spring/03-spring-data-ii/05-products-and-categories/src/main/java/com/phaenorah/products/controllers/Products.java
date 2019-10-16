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
@RequestMapping("/products")
public class Products {	
	ProductService productService;
	CategoryService categoryService;
	public Products(ProductService productService, CategoryService categoryService){
		this.productService = productService;
		this.categoryService = categoryService;
		
	}
	@RequestMapping("/new")
    public String newProduct(@ModelAttribute("product") Product product){
        return "/views/newProduct.jsp";
    }
	@PostMapping("")
    public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult result){
        if(result.hasErrors()){
            return "/views/newProduct.jsp";
        }else{
            productService.createProduct(product);
            return "redirect:/products/"+product.getId();
        }
    }
	@RequestMapping("/{id}")
    public String showProduct(@PathVariable("id") Long id, Model model){
        //get product
        //get categories by product
        Product product = productService.getProduct(id);
        Iterable<Category> categories = categoryService.availableCategoriesForProduct(product);        
        model.addAttribute("categories", categories);
        model.addAttribute("product", product);
        return "/views/product.jsp";
    }   
	@PostMapping("/addcategory")
    public String addCategory(@RequestParam("categoryVal") Long id, @RequestParam("productId") Long productId, Model model){
        Category category = categoryService.getCategory(id);
        Product product = productService.getProduct(productId);
        List<Category> categories = product.getCategories();
        categories.add(category);
        product.setCategories(categories);
        productService.createProduct(product);
        return "redirect:/products/"+product.getId();
    }

}
