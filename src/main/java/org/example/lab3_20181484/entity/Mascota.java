package org.example.lab3_20181484.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="mascota")
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//si es autoincremental
    @Column(name ="id", nullable = false)//para mapear
    private Integer id;

    @Column(name ="nombre", nullable = false, length = 45)//para mapear
    private String nombre;

    @Column(name ="edad", nullable = false)//para mapear
    private Integer edad;

    @Column(name ="genero", nullable = false, length = 45)//para mapear
    private String genero;

    @Column(name ="diagnostico", nullable = false, length = 100)//para mapear
    private String diagnostico;

    @Column(name ="fechacita", nullable = false)//para mapear
    private Date fechacita;

    @Column(name ="numeroconsultorio", nullable = false)//para mapear
    private Integer numeroconsultorio;

    @Column(name ="veterinarioid")//para mapear
    private Integer veterinarioid;

    @Column(name ="sedeid")//para mapear
    private Integer sedeid;




}
