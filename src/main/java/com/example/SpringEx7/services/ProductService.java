package com.example.SpringEx7.services;

import com.example.SpringEx7.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

   private List<Product> products = new ArrayList<>();

   public void addOne(Product product) {
       products.add(product);
   }

   public List<Product> findAll() {
       return products;
   }
}
