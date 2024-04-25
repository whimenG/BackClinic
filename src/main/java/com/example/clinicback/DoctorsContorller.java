package com.example.clinicback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorsContorller {

    @Autowired
    DoctorsService doctorsService;

    @GetMapping("/")
    public String first() {
        return "first page";
    }
    @PostMapping("/dcreate")
    public Doctor saveDoctor(@RequestBody Doctor doctor) {
        return doctorsService.createDoctor(doctor);
    }
}
