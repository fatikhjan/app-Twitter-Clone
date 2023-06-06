package com.twiiter.apptwiiterclone.sevice;

import com.twiiter.apptwiiterclone.domain.User;
import com.twiiter.apptwiiterclone.mapper.UserMapper;
import com.twiiter.apptwiiterclone.payload.UserCreateDTO;
import com.twiiter.apptwiiterclone.repositories.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final CheckService checkService;
    private final UserRepo userRepo;

    private final UserMapper userMapper;

    public String login(String userName, String password) {
        User entity = userRepo.findByUserName(userName).orElseThrow(() -> new RuntimeException("User Not Found"));
        if (!checkService.checkPassword(entity.getPassword(), password)) {
            throw new RuntimeException("UserName Or Password incorrect");
        }
        return "Ok";
    }

    public String register(UserCreateDTO userCreateDTO) {
        Optional<User> byUserName = userRepo.findByUserName(userCreateDTO.userName());
        if (byUserName.isPresent()) throw new RuntimeException("UserName already exist");
        User user = userMapper.toEntity(userCreateDTO);
        userRepo.save(user);
        return "ok";
    }
}
