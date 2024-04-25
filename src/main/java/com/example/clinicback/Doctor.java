package com.example.clinicback;

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
    private long indification_numer;
    private String adress;
    private String phone_numer;
    private boolean online_Consultations;
    private String working_hours;
}
