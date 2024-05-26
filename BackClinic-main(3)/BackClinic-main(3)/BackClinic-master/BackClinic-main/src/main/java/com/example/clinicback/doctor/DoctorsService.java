package com.example.clinicback.doctor;

import org.springframework.stereotype.Service;

@Service
public interface DoctorsService {
    public Doctor createDoctor(Doctor doctor);
}
