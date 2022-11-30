package com.spring.oauth2_resorceserver.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
@AllArgsConstructor
public class Food {

    private String name;
    private Integer quantity;
    private String description;
}
