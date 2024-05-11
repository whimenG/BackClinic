package com.example.clinicback.doctor;

public interface UserService {
    User registerUser(User user) throws Exception;
    User loginUser(String username, String password) throws  Exception;
}
