package com.miniLab.MiniLab.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
