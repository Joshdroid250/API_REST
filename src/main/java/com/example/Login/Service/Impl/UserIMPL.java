package com.example.Login.Service.Impl;

import com.example.Login.DTO.LoginDTO;
import com.example.Login.DTO.UserDTO;
import com.example.Login.Entity.User;
import com.example.Login.Repo.UserRepo;
import com.example.Login.Response.LoginResponse;
import com.example.Login.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserIMPL  implements UserService {


    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public String addUser(UserDTO userDTO) {


        User user = new User(
                userDTO.getIduser(),
                userDTO.getUsername(),
                userDTO.getLastname(),
                userDTO.getName(),
                this.passwordEncoder.encode(userDTO.getPassword()),
                userDTO.getEmail(),
                userDTO.getState()
        );


        userRepo.save(user);
        return user.getUsername();
    }

    @Override
    public LoginResponse loginUser(LoginDTO loginDTO) {

        String msg = "";
        User user1 = userRepo.findByEmail(loginDTO.getEmail());
        if (user1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = user1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<User> user = userRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (user.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else {

                return new LoginResponse("password Not Match", false);
            }
        }else {
            return new LoginResponse("Email not exits", false);
        }
    }
}
