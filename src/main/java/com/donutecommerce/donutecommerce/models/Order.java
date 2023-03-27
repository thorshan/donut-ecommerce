package com.donutecommerce.donutecommerce.models;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String address;

    private Date createdDate;

    @ManyToOne
    @JoinColumn(name = "users_id", referencedColumnName = "id")
    private UserEntity userEntity;
}
