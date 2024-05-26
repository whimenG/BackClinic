package com.example.clinicback.User;



@Controller
public class UserController {
    @Autowired
    UserDetailsService userDetailsService;
    @Autowired
    private UserService userService;

    public UserController() {
    }

    @GetMapping({"/register"})
    public String getRegistrationPage(@ModelAttribute("user") UserDto userDto) {
        return "register";
    }

    @PostMapping({"/register"})
    public String saveUser(@ModelAttribute("user") UserDto userDto, Model model) {
        this.userService.save(userDto);
        model.addAttribute("message", "Registered Successfuly!");
        return "register";
    }

    @GetMapping({"/login"})
    public String login() {
        return "login";
    }

    @GetMapping({"user-page"})
    public String userPage(Model model, Principal principal) {
        UserDetails userDetails = this.userDetailsService.loadUserByUsername(principal.getName());
        model.addAttribute("user", userDetails);
        return "user";
    }

    @GetMapping({"admin-page"})
    public String adminPage(Model model, Principal principal) {
        UserDetails userDetails = this.userDetailsService.loadUserByUsername(principal.getName());
        model.addAttribute("user", userDetails);
        return "admin";
    }
}


    @PostMapping("/login")
    public User loginUser(@RequestParam String username, @RequestParam String password) throws Exception {
        return userService.loginUser(username, password);
    }
}
