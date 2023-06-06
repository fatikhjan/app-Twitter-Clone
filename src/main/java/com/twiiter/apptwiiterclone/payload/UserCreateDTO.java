package com.twiiter.apptwiiterclone.payload;

import jakarta.validation.constraints.NotBlank;

public record UserCreateDTO(@NotBlank String userName,
                            @NotBlank String name,
                            @NotBlank String password,
                            @NotBlank String dateOfBirth) implements BaseDTO {
}
