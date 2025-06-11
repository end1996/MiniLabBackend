package com.miniLab.MiniLab.service;

import com.miniLab.MiniLab.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    Usuario guardar(Usuario usuario);
    List<Usuario> listarTodos();
    Optional<Usuario> buscarPorId(Long id);
    void eliminar(Long id);
}
