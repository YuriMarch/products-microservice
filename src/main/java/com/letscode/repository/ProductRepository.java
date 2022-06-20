package com.letscode.repository;

import com.letscode.model.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface ProductRepository extends ReactiveCrudRepository<Product, String> {
    Flux<Product> findByCategory(String category);
}
