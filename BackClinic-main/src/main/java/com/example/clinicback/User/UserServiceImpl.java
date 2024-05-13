//package com.example.clinicback.doctor;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import java.util.ArrayList;
//
//@Service
//public class UserServiceImpl implements UserService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @Override
//    public User registerUser(User user) throws Exception {
//        if (userRepository.findByUsername(user.getUsername()) != null) {
//            throw new Exception("Username already exists");
//        }
//
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        return userRepository.save(user);
//    }
//
//    @Override
//    public User loginUser(String username, String password) throws Exception {
//        User user = userRepository.findByUsername(username);
//        if (user == null) {
//            throw new Exception("User not found");
//        }
//
//        if (!passwordEncoder.matches(password, user.getPassword())) {
//            throw new Exception("Invalid password");
//        }
//
//        return user;
//    }
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByUsername(username);
//        if (user == null) {
//            throw new UsernameNotFoundException("User not found with username: " + username);
//        }
//        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), new ArrayList<>());
//    }
//}