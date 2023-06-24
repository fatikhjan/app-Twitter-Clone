package com.twiiter.apptwiiterclone.mapper;

import com.twiiter.apptwiiterclone.domain.User;
import com.twiiter.apptwiiterclone.payload.UserCreateDTO;
import com.twiiter.apptwiiterclone.payload.UserResponseDTO;
import com.twiiter.apptwiiterclone.payload.UserUpdateDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserMapper implements GenericMapper<UserCreateDTO, UserUpdateDTO, UserResponseDTO, User>, BaseMapper {
    @Override
    public User toEntity(UserCreateDTO dto) {
        if (dto == null) {
            return null;
        }
        return User.builder()
                .userName(dto.userName())
                .name(dto.name())
                .password(dto.password())
                .dateOfBirth(dto.dateOfBirth())
                .build();
    }

    @Override
    public UserResponseDTO toDTO(User entity) {
        return null;
    }

    @Override
    public List<UserResponseDTO> toListDTO(List<User> entity) {
        return null;
    }

//    @Override
//    public User partialUpdate(UserUpdateDTO dto, User user) {
//        return null;
//    }
}
