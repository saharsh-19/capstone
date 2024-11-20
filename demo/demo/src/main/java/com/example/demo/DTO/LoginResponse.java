package com.example.demo.DTO;
import com.example.demo.Service.UserServiceImpl;

public class LoginResponse {
    private String message;
    private String token;

    public String getMessage() {
        return message;
    }

    public LoginResponse(String message,String token) {
        this.message = message;
        this.token=token;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }



}
