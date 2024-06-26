package com.study.designpatterns._02_structural_patterns._06_adapter._02_after;

import com.study.designpatterns._02_structural_patterns._06_adapter._02_after.security.UserDetails;

public class Account implements UserDetails {
    private String name;
    private String password;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String getUsername() {
        return null;
    }
}
