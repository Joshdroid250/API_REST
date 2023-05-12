package com.example.Login.Service;

import com.example.Login.DTO.LoginDTO;
import com.example.Login.DTO.UserDTO;
import com.example.Login.Response.LoginResponse;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public interface UserService {
    String addUser(UserDTO userDTO);

    LoginResponse loginUser(LoginDTO loginDTO);
}
