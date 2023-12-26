package com.scratchapp.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="user")
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "username")
    private String username_;

    @Column(name = "email")
    private String email_;

    public user(){
    }

    public user(int id, String username_, String email_) {
        this.id = id;
        this.username_ = username_;
        this.email_ = email_;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername_() {
        return username_;
    }

    public void setUsername_(String username_) {
        this.username_ = username_;
    }

    public String getEmail_() {
        return email_;
    }

    public void setEmail_(String email_) {
        this.email_ = email_;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", username_='" + username_ + '\'' +
                ", email_='" + email_ + '\'' +
                '}';
    }
}















