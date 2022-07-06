package com.letscode.controller;

import com.letscode.dto.ProductRequest;
import com.letscode.model.Product;
import com.letscode.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public Mono<Product> createProduct(@RequestBody ProductRequest productRequest) {
        return productService.createProduct(productRequest);
    }

    @GetMapping
    public Flux<Product> findAllProducts() {
        return productService.findAllProducts();
    }

    @GetMapping("/{id}")
    public Mono<Product> findProductById(@PathVariable String id) {
        return productService.findById(id);
    }

    @GetMapping("/category")
    public Flux<Product> findProductsByCategory(@RequestBody String category) {
        return productService.findByCategory(category);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteProductById(@PathVariable String id) {
        return productService.deleteById(id);
    }
}
