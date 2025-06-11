package com.miniLab.MiniLab.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.miniLab.MiniLab.model.Empleado;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UsuarioDTO {

    private Long id;
    private String rol;
    private String usuario;

    @JsonIgnoreProperties("clave")
    private String clave;

    private Long empleadoId;
}
