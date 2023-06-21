package com.twiiter.apptwiiterclone.exeption;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.security.InvalidParameterException;

@Slf4j
@RestControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public ResponseEntity<AppErrorDTO> handleUnknownExceptions(Exception e, HttpServletRequest request) {
        e.printStackTrace();
        return ResponseEntity.internalServerError().body(
                new AppErrorDTO(
                        request.getRequestURI(),
                        e.getMessage(),
                        500
                )
        );
    }


    @org.springframework.web.bind.annotation.ExceptionHandler(InvalidParameterException.class)
    public ResponseEntity<AppErrorDTO> handleOTPExpiredException(InvalidParameterException e, HttpServletRequest request) {
        return ResponseEntity.status(400)
                .body(new AppErrorDTO(request.getRequestURI(), e.getMessage(), 400));
    }


}
