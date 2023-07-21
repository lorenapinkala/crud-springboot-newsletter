package com.academy.atl.newsletter.models;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name="email")
@Data
public class Email {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "email")
    private String email;
}
