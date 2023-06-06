package com.twiiter.apptwiiterclone.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Users")
public class User implements BaseEntity {

    @Id
    private String userName;
    private String password;
    private String name;
    private String bio;
    private String job;
    private String location;
    private String linkedWebSite;
    private String dateOfBirth;
    private String whenJoined;
    private Integer followed;
    private Integer followers;

}
