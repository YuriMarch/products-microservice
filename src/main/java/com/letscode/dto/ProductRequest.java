package com.letscode.dto;

import com.letscode.enumerator.Category;
import com.letscode.enumerator.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Getter @Setter
@NoArgsConstructor
@ToString
@Entity
public class ProductRequest {

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
}
