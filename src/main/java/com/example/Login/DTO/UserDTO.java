package com.example.Login.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class UserDTO {


    private int iduser;
    private String username;
    private String lastname;

    private String name;
    private String password;
    private String email;
    private  int state;


    public UserDTO(int iduser, String username, String lastname,  String name, String password, String email, int state) {
        this.iduser = iduser;
        this.username = username;
        this.lastname = lastname;
        this.name = name;
        this.password = password;
        this.email = email;
        this.state = state;
    }

    public UserDTO() {
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastname() {
        return lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "iduser=" + iduser +
                ", username='" + username + '\'' +
                ", lastname='" + lastname + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", state=" + state +
                '}';
    }
}
