package com.example.clinicback.User;


import com.example.clinicback.User.User;
import com.example.clinicback.User.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UserController {
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) throws Exception {
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public User loginUser(@RequestParam String username, @RequestParam String password) throws Exception {
        return userService.loginUser(username, password);
    }
}
