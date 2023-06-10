package com.twiiter.apptwiiterclone.sevice;

import com.twiiter.apptwiiterclone.config.JwtService;
import com.twiiter.apptwiiterclone.domain.User;
import com.twiiter.apptwiiterclone.mapper.UserMapper;
import com.twiiter.apptwiiterclone.payload.UserCreateDTO;
import com.twiiter.apptwiiterclone.repositories.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final CheckService checkService;

    private final JwtService jwtService;
    private final UserRepo userRepo;

    private final UserMapper userMapper;

    private final AuthenticationManager authenticationManager;

    public String login(String userName, String password) {

        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        userName, password
                )
        );
        User entity = userRepo.findByUserName(userName).orElseThrow(() -> new RuntimeException("User Not Found"));
        if (!checkService.checkPassword(entity.getPassword(), password)) {
            throw new RuntimeException("UserName Or Password incorrect");
        }
        return jwtService.generateToken(entity);
    }

    public String register(UserCreateDTO userCreateDTO) {
        Optional<User> byUserName = userRepo.findByUserName(userCreateDTO.userName());
        if (byUserName.isPresent()) throw new RuntimeException("UserName already exist");
        User user = userMapper.toEntity(userCreateDTO);
        user.setPassword(checkService.encodePassword(user.getPassword()));
        userRepo.save(user);
        return jwtService.generateToken(user);
    }
}
