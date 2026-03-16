package com.greatlearning.great_kart.controller;


import com.greatlearning.great_kart.entity.Product;
import com.greatlearning.great_kart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;


    @GetMapping("/products")
        public List<Product> getAllProducts()
    {
        return productRepository.findAll();
    }

    @PostMapping("/products")
    public  Product addProduct(@RequestBody Product product)
    {
        return productRepository.save(product);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<?> searchProduct (@PathVariable Long id) {
        Optional<Product> product = productRepository.findById(id);
        //  if(product.isPresent()){
        //  return ResponseEntity.ok(product.get());
        // }
        // return ResponseEntity.notFound().build();

        return productRepository.findById(id)
                .map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
        //Get - Getting the resource
        //Post - Add new resource
        //Patch - Update existing resource
        //Put - Replace existing resource
        //Delete - Delete existing resource

       @PatchMapping("/products")
       public Product updateProduct(@RequestBody Product product){
        //Validate if product exist before doing save
           return productRepository.save(product);
        }

        @DeleteMapping("/products/{id}")
        public void delete(@PathVariable Long id){
        productRepository.deleteById(id);
        }

        @GetMapping("/search-product")

        public ResponseEntity<?> searchByName(@RequestParam String name) {
           return productRepository.findByName(name).map
                   (ResponseEntity::ok).orElse(ResponseEntity.notFound().build());

        }
    @PatchMapping("/products/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product updatedProduct) {

        Product product = productRepository.findById(id).orElseThrow();

        if (updatedProduct.getName() != null) {
            product.setName(updatedProduct.getName());
        }

        if (updatedProduct.getPrice() != null) {
            product.setPrice(updatedProduct.getPrice());
        }

        return productRepository.save(product);
    }
    }
