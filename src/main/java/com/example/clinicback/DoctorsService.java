package com.example.clinicback;

import org.springframework.stereotype.Service;

@Service
public interface DoctorsService {
    public  Doctor createDoctor(Doctor doctor);
}
