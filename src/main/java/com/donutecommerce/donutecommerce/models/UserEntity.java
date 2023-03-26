package com.donutecommerce.donutecommerce.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;

    private String password;

    private String email;

    private Date createdDate;

    private Date updatedDate;

    @ManyToOne
    private Role role;

//    @OneToMany
//    private List<Order> orders;
}
