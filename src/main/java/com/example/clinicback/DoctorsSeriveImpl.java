package com.example.clinicback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorsSeriveImpl implements DoctorsService {

    @Autowired
    DoctorsRepository dRepository;

    @Override
    public Doctor createDoctor(Doctor doctor) {
        return dRepository.save(doctor);
    }
}