package com.miniLab.MiniLab.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Entity
@Table (name="Empleado")
@NoArgsConstructor
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nombre;
    private String apellido;
    private String contacto;
    private String email;
    private String direccion;
    private String dni;
    private Date fecha_ingreso;
    private String rol_operativo;
    private boolean activo;
}
