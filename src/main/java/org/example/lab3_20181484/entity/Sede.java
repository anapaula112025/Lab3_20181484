package org.example.lab3_20181484.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="sede")
public class Sede {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//si es autoincremental
    @Column(name ="id", nullable = false)//para mapear
    private Integer id;

    @Column(name ="nombre", nullable = false, length = 50)//para mapear
    private String nombre;

    @Column(name ="direccion", nullable = false, length = 100)//para mapear
    private String direccion;

    @Column(name ="telefono",nullable = false, length = 45)//para mapear
    private String telefono;
}
