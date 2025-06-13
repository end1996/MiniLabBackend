package com.miniLab.MiniLab.DTO;

import com.miniLab.MiniLab.model.Empleado;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;

@Data
@AllArgsConstructor

public class OrdenProduccionDTO {

    private Long id;
    private int cantidad_cuadros;
    private Date fecha_inicio;
    private boolean estado;
    private String observaciones;
    private Long empleadoId;
}
