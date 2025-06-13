package com.miniLab.MiniLab.service;

import com.miniLab.MiniLab.DTO.UsuarioDTO;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    UsuarioDTO guardar(UsuarioDTO usuarioDTO);
    List<UsuarioDTO> listarTodos();
    Optional<UsuarioDTO> buscarPorId(Long id);
    Optional<UsuarioDTO> actualizar(Long id, UsuarioDTO dto);
    void eliminar(Long id);
}