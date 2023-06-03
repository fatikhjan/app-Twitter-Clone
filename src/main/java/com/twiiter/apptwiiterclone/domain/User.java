package com.twiiter.apptwiiterclone.domain;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    private String userName;
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
