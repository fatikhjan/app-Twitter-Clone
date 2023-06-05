package com.twiiter.apptwiiterclone.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class User {

    @Id
    private String userName;
    private String password;
    private String name;
    private String bio;
    private String job;
    private String location;
    private String linkedWebSite;
    private LocalDate dateOfBirth;
    private LocalDate whenJoined;
    private Integer followed;
    private Integer followers;

}
