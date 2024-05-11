package com.example.clinicback.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin (origins = "http://localhost:4200")
@RestController
public class DoctorsContorller {

    @Autowired
    private DoctorsService doctorsService;
    @Autowired
    DoctorsSeriveImpl doctorsSeriveImpl;
    @GetMapping("/")
    public String first() {
        return "first page";
    }
    @PostMapping("/dcreate")
    public Doctor saveDoctor(@RequestBody Doctor doctor) {
        return doctorsService.createDoctor(doctor);
    }

    @GetMapping("/hard")
    public Doctor hard() {
        return doctorsSeriveImpl.hard();
    }
    @GetMapping("/hardlist")
    public List<Doctor> hardList() {
        return  doctorsSeriveImpl.hardall();
    }
    @GetMapping("/dbdata")
    public List<Doctor> dbData() {
        return doctorsSeriveImpl.findAllDoctorsdb();
    }
}
