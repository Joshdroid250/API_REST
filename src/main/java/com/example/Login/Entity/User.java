package com.example.Login.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "id_user", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int iduser;

    @Column(name = "username", length = 255)
    private String username;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "lastname", length = 255)
    private String lastname;

    @Column(name = "password", length = 255)
    private String password;

    @Column(name = "email", length = 255)
    private String email;

    @Column(name = "state", length = 255)
    private  int state;

    public User(int iduser, String username, String name, String lastname, String password, String email, int state) {
        this.iduser = iduser;
        this.username = username;
        this.name = name;
        this.lastname = lastname;
        this.password = password;
        this.email = email;
        this.state = state;
    }


    public User() {
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

    public String getName(){ return name;}

    public  void setName(String name){ this.name = name; }

    public String getLastname() {
        return lastname;
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
        return "User{" +
                "iduser=" + iduser +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", state=" + state +
                '}';
    }
}
