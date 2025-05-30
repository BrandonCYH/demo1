package com.demo1.demo1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "userAccess")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class SystemConfiguration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user")
    private String user;

    @Column(name = "role")
    private String role;

    @Column(name = "product")
    private String product;

    @Column(name = "category")
    private String category;
}
