package com.kyuubi.angatbuhat.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@Entity(name = "users")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String username;

    @Column(unique = true)
    private String email;

    @Column
    private String password;

    @Column
    private Roles role;

//    @Column
//    private Date createdAt;
//
//    @Column
//    private Date updatedAt;
}
