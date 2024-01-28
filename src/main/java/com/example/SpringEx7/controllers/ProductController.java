package com.example.SpringEx7.controllers;

import com.example.SpringEx7.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/products")
    public String viewAll(Model model) {
        model.addAttribute("products", productService.findAll());

        return "products.html";
    }
}
