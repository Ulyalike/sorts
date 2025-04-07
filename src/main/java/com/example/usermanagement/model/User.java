package com.example.usermanagement.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserBook> books;
    
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserUniversity> universities;
    
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserCourse> courses;
}
