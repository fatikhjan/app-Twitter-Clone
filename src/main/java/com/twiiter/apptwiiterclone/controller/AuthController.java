package com.twiiter.apptwiiterclone.controller;

import com.twiiter.apptwiiterclone.payload.UserCreateDTO;
import com.twiiter.apptwiiterclone.sevice.AuthService;
import com.twiiter.apptwiiterclone.sevice.CheckService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/auth")
public class AuthController {

    private final CheckService checkService;

    private final AuthService authService;


    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam @NotBlank String userName, @NotBlank String password) {
        return ResponseEntity.ok(authService.login(userName, password));
    }


    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody @Valid UserCreateDTO userCreateDTO) {
        return ResponseEntity.status(201).body(authService.register(
                userCreateDTO
        ));
    }


}
