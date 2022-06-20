package com.letscode.service.impl;

import com.letscode.dto.ProductRequest;
import com.letscode.model.Product;
import com.letscode.repository.ProductRepository;
import com.letscode.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Mono<Product> createProduct(ProductRequest productRequest){
        Product product = Product.fromRequest(productRequest);
        return productRepository.save(product);
    }

    @Override
    public Flux<Product> findAllProducts(){
        return productRepository.findAll();
    }

    @Override
    public Mono<Product> findById(String id){
        return productRepository.findById(id);
    }

    @Override
    public Flux<Product> findByCategory(String category){
        return productRepository.findByCategory(category);
    }

    @Override
    public Mono<Void> deleteById(String id){
        return productRepository.deleteById(id);
    }
}
