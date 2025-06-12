package com.miniLab.MiniLab.mapper;

import com.miniLab.MiniLab.DTO.UsuarioDTO;
import com.miniLab.MiniLab.model.Empleado;
import com.miniLab.MiniLab.model.Usuario;

public class UsuarioMapper {

    public static UsuarioDTO toDTO(Usuario usuario) {
        return new UsuarioDTO(
                usuario.getId(),
                usuario.getRol(),
                usuario.getUsuario(),
                usuario.getClave(),
                usuario.getEmpleado() != null ? usuario.getEmpleado().getId() : null
        );
    }

    public static Usuario toEntity(UsuarioDTO dto) {
        Usuario usuario = new Usuario();
        usuario.setId(dto.getId());
        usuario.setRol(dto.getRol());
        usuario.setUsuario(dto.getUsuario());
        usuario.setClave(dto.getClave());
        if (dto.getEmpleadoId() != null) {
            Empleado empleado = new Empleado();
            empleado.setId(dto.getEmpleadoId());
            usuario.setEmpleado(empleado);
        }
        return usuario;
    }
}
