package com.twiiter.apptwiiterclone.controller;

import com.twiiter.apptwiiterclone.payload.UserCreateDTO;
import com.twiiter.apptwiiterclone.sevice.AuthService;
import com.twiiter.apptwiiterclone.sevice.CheckService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController implements BaseController {

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
