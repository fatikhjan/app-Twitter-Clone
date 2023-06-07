package com.twiiter.apptwiiterclone.mapper;

import com.twiiter.apptwiiterclone.domain.User;
import com.twiiter.apptwiiterclone.payload.UserCreateDTO;
import com.twiiter.apptwiiterclone.payload.UserResponseDTO;
import com.twiiter.apptwiiterclone.payload.UserUpdateDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;

@Component
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper extends GenericMapper<UserCreateDTO, UserUpdateDTO, UserResponseDTO, User> {
}
