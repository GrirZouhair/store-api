package com.grirzouhair.storeapi.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UserDtos {
    private Long id;
    private String name;
    private String email;
}
