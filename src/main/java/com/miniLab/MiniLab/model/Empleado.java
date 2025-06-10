package com.miniLab.MiniLab.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name="Empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String apellido;
}
