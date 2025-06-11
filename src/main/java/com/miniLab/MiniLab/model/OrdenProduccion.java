package com.miniLab.MiniLab.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Entity
@NoArgsConstructor
public class OrdenProduccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int cantidad_cuadros;
    private Date fecha_inicio;
    private boolean estado;
    private String observaciones;

    @ManyToOne
    @JoinColumn(name = "id_empleado", referencedColumnName = "id")
    private Empleado empleado;
}
