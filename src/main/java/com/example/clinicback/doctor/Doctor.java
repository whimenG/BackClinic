package com.example.clinicback.doctor;

import jakarta.persistence.*;
import lombok.*;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Table( schema = "clinic" , name = "doctors")

public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private long indification_number;
    private String address;
    private String phone_number;
    private boolean online_Consultations;
    private String working_hours;
}
