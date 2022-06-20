package com.letscode.service;

import com.letscode.dto.ProductRequest;
import com.letscode.model.Product;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {

    Mono<Product> createProduct(ProductRequest productRequest);
    Flux<Product> findAllProducts();
    Mono<Product> findById(String id);
    Flux<Product> findByCategory(String category);
    Mono<Void> deleteById(String id);
}
