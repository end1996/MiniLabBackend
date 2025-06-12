package com.miniLab.MiniLab.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;

@Data
@AllArgsConstructor
public class EmpleadoDTO {

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
