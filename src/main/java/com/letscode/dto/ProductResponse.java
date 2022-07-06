package com.letscode.dto;

import com.letscode.enumerator.Size;
import com.letscode.model.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.stream.Collectors;

@Getter @Setter
@NoArgsConstructor
@ToString
public class ProductResponse extends ProductRequest {

    private String id;

    public ProductResponse(Product product){
        this.setId(product.getId());
        this.setName(product.getName());
        this.setPrice(product.getPrice());
        this.setQuantity(product.getQuantity());
        this.setDescription(product.getDescription());
        this.setCategory(product.getCategory());

        if (product.getSize() == null){
            this.setSize(Size.M);
        } else {
            this.setSize(product.getSize());
        }
    }

    public static List<ProductResponse> toResponse(List<Product> products){
        return products.stream().map(ProductResponse::new).collect(Collectors.toList());
    }
}
