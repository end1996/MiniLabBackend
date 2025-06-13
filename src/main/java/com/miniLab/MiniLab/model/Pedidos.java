/*package com.miniLab.MiniLab.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Entity
@NoArgsConstructor
@Table(name = "pedido")
public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo_servicio;
    private Date fecha;
    private Double total;
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name="id_responsable",referencedColumnName = "id")
    private Responsable responsable_id;
}*/
