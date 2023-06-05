package com.twiiter.apptwiiterclone.payload;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record UserDTO(
        @NotBlank
//    @Pattern(regexp = )
        String userName,
        @NotBlank String name,
        @NotBlank String password,
        @NotBlank LocalDate dateOfBirth) {
}
