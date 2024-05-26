package com.example.clinicback.User;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl() {
    }

    public User save(UserDto userDto) {
        User user = new User(userDto.getEmail(), this.passwordEncoder.encode(userDto.getPassword()), userDto.getRole(), userDto.getUsername());
        return (User)this.userRepository.save(user);
    }
