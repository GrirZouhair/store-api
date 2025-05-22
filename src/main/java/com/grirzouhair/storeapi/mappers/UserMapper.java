package com.grirzouhair.storeapi.mappers;

import com.grirzouhair.storeapi.dtos.UserDtos;
import com.grirzouhair.storeapi.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDtos toDto(User user);
}
