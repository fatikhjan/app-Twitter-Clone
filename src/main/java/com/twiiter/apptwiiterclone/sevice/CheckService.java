package com.twiiter.apptwiiterclone.sevice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Base64;

@Service
@RequiredArgsConstructor
public class CheckService {


    public boolean checkPassword(String userPassword, String password) {

        return new String(Base64.getEncoder().encode(password.getBytes())).equals(userPassword);
    }

    public String encodePassword(String password) {
        return Base64.getEncoder().encodeToString(password.getBytes());
    }
}
