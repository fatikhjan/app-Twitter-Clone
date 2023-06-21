package com.twiiter.apptwiiterclone.repositories;

import com.twiiter.apptwiiterclone.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, String> {
    Optional<User> findByUserName(String userName);
}
