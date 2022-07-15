package com.letscode.service;

import com.letscode.dto.ProductRequest;
import com.letscode.model.Product;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@Validated
public interface ProductService {

    Mono<Product> createProduct(@Valid ProductRequest productRequest);
    Flux<Product> findAllProducts();
    Mono<Product> findById(String id);
    Flux<Product> findByCategory(String category);
    Mono<Void> deleteById(String id);
}
