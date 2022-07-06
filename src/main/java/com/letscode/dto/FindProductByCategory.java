package com.letscode.dto;

import com.letscode.enumerator.Category;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@NoArgsConstructor
@ToString
public class FindProductByCategory {
    private Category category;
}
