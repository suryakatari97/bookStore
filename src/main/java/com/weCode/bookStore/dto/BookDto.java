package com.weCode.bookStore.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Creates getters and setters
@Builder //creates title using builder pattern
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    private String title;

}
 