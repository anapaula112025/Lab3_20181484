package org.example.lab3_20181484.entity;

import jakarta.persistence.*;

@Entity
@Table(name="veterinario")
public class veterinario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//si es autoincremental
    @Column(name ="id", nullable = false)//para mapear
    private Integer id;

    @Column(name ="nombre", nullable = false, length = 50)//para mapear
    private String nombre;

    @Column(name ="correo", nullable = false, length = 50)//para mapear
    private String correo;

    @Column(name ="sedeid")//para mapear
    private Integer sedeid;

}
