package com.example.SpringEx7.controllers;

import com.example.SpringEx7.models.Product;
import com.example.SpringEx7.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String viewAll(Model model) {
        model.addAttribute("products", productService.findAll());

        return "products.html";
    }

    @PostMapping("/products")
    // Products is fetched from the request parameters
    public String addOne(Product product,
                         Model model) {
        /*
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
         */
        productService.addOne(product);

        model.addAttribute("products", productService.findAll());

        return "products.html";
    }
}
