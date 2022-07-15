package com.letscode.model;

import com.letscode.dto.ProductRequest;
import com.letscode.enumerator.Category;
import com.letscode.enumerator.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.UUID;

@Getter @Setter
@NoArgsConstructor
@ToString
@Entity
public class Product {

    @Id
    private String id;

    @NotBlank
    private String name;

    @NotBlank
    @Min(value = 0L, message = "The value must be positive.")
    private BigDecimal price;

    @NotBlank
    @Min(value = 0, message = "The value must be positive.")
    private Integer quantity;

    private String description;

    @NotBlank
    private Size size;

    @NotBlank
    private Category category;

    public static Product fromRequest(ProductRequest productRequest) {
        Product product = new Product();
        product.setId(UUID.randomUUID().toString());
        product.setName(productRequest.getName());
        product.setPrice(productRequest.getPrice());
        product.setQuantity(productRequest.getQuantity());
        product.setDescription(productRequest.getDescription());
        product.setSize(productRequest.getSize());
        product.setCategory(productRequest.getCategory());
        return product;
    }
}
