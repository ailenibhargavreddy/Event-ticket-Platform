package com.bhargav.tickets.domain.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTicketTypeRequestDto {
    @NotBlank
    private String name;

    @NotNull(message = "Price is required")
    @PositiveOrZero(message = "Price must be zer or greater")
    private Double price;


    private String description;


    private Integer totalAvailable;
}
