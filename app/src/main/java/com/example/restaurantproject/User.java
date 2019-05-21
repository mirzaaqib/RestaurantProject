package com.example.restaurantproject;

import java.util.Date;

public class User {

    String email;
    String password;
    Date sessionExpiryDate;


    public void setUsername(String email) {

        this.email = email;
    }

    public void setFullName(String password) {

        this.password = password;
    }

    public void setSessionExpiryDate(Date sessionExpiryDate) {

        this.sessionExpiryDate = sessionExpiryDate;
    }

    public String getEmail() {

        return email;
    }

    public String getPassword() {

        return password;
    }

    public Date getSessionExpiryDate() {

        return sessionExpiryDate;
    }
}
