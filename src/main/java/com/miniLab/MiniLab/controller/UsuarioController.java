package com.miniLab.MiniLab.controller;

import com.miniLab.MiniLab.model.Usuario;
import com.miniLab.MiniLab.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    // Listar todos los usuarios
    @GetMapping("usuarios")
    public List<Usuario> getUsuarios() {
        return usuarioService.listarTodos();
    }

    // Crear un nuevo usuario
    @PostMapping("usuarios")
    public Usuario guardarUsuario(@RequestBody Usuario usuario) {
        usuario.setId(null); // Asegurarse de que es nuevo
        return usuarioService.guardar(usuario);
    }

    @PutMapping
    // Actualizar usuario existente
    public ResponseEntity<Usuario> actualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
        Optional<Usuario> usuarioExistente = usuarioService.buscarPorId(id);

        if (usuarioExistente.isPresent()) {
            usuario.setId(id); // Actualizar id mapeado
            Usuario actualizado = usuarioService.guardar(usuario);
            return ResponseEntity.ok(actualizado);
        } else {
            return ResponseEntity.notFound().build(); // HTTP 404
        }
    }

    // Eliminar usuario por ID
    @DeleteMapping("/{id}")
    public String deleteUsuario(@PathVariable Long id) {
        this.usuarioService.eliminar(id);
        return "El registro ID: " + id + "se eliminó correctamenre";
    }
}
