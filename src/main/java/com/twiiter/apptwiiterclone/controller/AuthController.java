package com.twiiter.apptwiiterclone.controller;

import com.twiiter.apptwiiterclone.payload.UserDTO;
import com.twiiter.apptwiiterclone.sevice.AuthService;
import com.twiiter.apptwiiterclone.sevice.CheckService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final CheckService checkService;

    private final AuthService authService;


    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam @NotBlank String userName, @NotBlank String password) {
        return ResponseEntity.ok(authService.login(userName, password));
    }


    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody @Valid UserDTO userDTO) {
        return ResponseEntity.status(201).body(authService.register(
                userDTO
        ));
    }


}
