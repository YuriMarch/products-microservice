package com.letscode.dto;

import com.letscode.enumerator.Category;
import com.letscode.enumerator.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter @Setter
@NoArgsConstructor
@ToString
public class ProductRequest {

    private String name;
    private BigDecimal price;
    private Integer quantity;
    private String description;
    private Size size;
    private Category category;
}
