package com.example.clinicback.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorsSeriveImpl implements DoctorsService {

    @Autowired
    DoctorsRepository dRepository;
    public Doctor hard() {
    return new Doctor(1L,"Name","Surname",133L,"address","999-999-999",true ,"9-16");
    }
    public List<Doctor> hardall() {
        Doctor doctor2 = new Doctor(2L,"Jacob","White",133L,"address","999-999-999",true ,"9-16");
        Doctor doctor3 = new Doctor(3L,"Name","Surname",133L,"address","999-999-999",true ,"9-16");
        List<Doctor> doctorList = new ArrayList<>();
        doctorList.add(doctor2);
        doctorList.add(doctor3);
        return doctorList;
    }
    @Override
    public Doctor createDoctor(Doctor doctor) {
        return dRepository.save(doctor);
    }
    public List<Doctor> findAllDoctorsdb() {
        return dRepository.findAll();
    }
}