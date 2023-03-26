package com.teem.teem.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String productName;

    private String productImage;

    private String productPrice;

    private String productDescription;

    private Date createdDate;

    private Date updatedDate;

    @ManyToOne
    private Category category;


}
