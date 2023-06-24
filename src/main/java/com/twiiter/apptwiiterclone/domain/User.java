package com.twiiter.apptwiiterclone.domain;

import com.twiiter.apptwiiterclone.domain.enums.Role;
import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Users")
@Builder
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
    @Enumerated(EnumType.STRING)
    private Role role = Role.USER;

//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return List.of(new SimpleGrantedAuthority(role.name()));
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public String getUsername() {
//        return userName;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
}
