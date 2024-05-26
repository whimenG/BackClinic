package com.example.clinicback.User;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private String email;
    private String password;
    private String role;
    private String username;
}
