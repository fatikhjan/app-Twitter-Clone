package com.twiiter.apptwiiterclone.sevice;

import org.springframework.stereotype.Service;

import java.util.Base64;

@Service
public class CheckService {

    public boolean checkPassword(String userPassword, String password) {
        return new String(Base64.getEncoder().encode(password.getBytes())).equals(password);
    }
}
