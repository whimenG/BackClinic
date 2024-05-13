package com.example.clinicback.User;

import com.example.clinicback.User.User;

public interface UserService {
    User registerUser(User user) throws Exception;
    User loginUser(String username, String password) throws  Exception;
}
