package com.miniLab.MiniLab.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table (name="Usuario")
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String rol;
    private String usuario;
    private String clave;

    @OneToOne
    @JoinColumn(name= "empleado_id", referencedColumnName = "id")
    private Empleado empleado;
}
