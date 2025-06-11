package com.miniLab.MiniLab.controller;

import com.miniLab.MiniLab.DTO.UsuarioDTO;
import com.miniLab.MiniLab.mapper.UsuarioMapper;
import com.miniLab.MiniLab.model.Usuario;
import com.miniLab.MiniLab.service.UsuarioService;
import org.springframework.http.ResponseEntity;
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
    public List<UsuarioDTO> listarUsuarios() {
        return usuarioService.listarTodos();
    }

    // Crear un nuevo usuario
    @PostMapping("usuarios")
    public ResponseEntity<UsuarioDTO> crearUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        UsuarioDTO creado = usuarioService.guardar(usuarioDTO);
        return ResponseEntity.ok(creado);
    }

    @PutMapping("usuarios/{id}")
    public ResponseEntity<UsuarioDTO> actualizarUsuario(@PathVariable Long id, @RequestBody UsuarioDTO usuarioDTO) {
        return usuarioService.actualizar(id, usuarioDTO)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Eliminar usuario por ID
    @DeleteMapping("usuarios/{id}")
    public ResponseEntity<String> eliminarUsuario(@PathVariable Long id) {
        usuarioService.eliminar(id);
        return ResponseEntity.ok("El registro ID: " + id + " se eliminó correctamente");
    }
}
