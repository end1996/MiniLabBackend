/*package com.miniLab.MiniLab.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class DetalleOrdenProduccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @ManyToOne
    @JoinColumn(name = "orden_produccion_id", referencedColumnName = "id")
    private OrdenProduccion orden_produccion_id;

    @JoinColumn(name = "varilla_id", referencedColumnName = "id")
    private Varilla varilla_id;
}*/
