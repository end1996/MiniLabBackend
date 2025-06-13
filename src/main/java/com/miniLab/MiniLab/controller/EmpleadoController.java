package com.miniLab.MiniLab.controller;

import com.miniLab.MiniLab.DTO.EmpleadoDTO;
import com.miniLab.MiniLab.service.EmpleadoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class EmpleadoController {

    private final EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    // Listar todos los empleados
    @GetMapping("empleados")
    public List<EmpleadoDTO> listarEmpleados() {
        return empleadoService.listarTodos();
    }

    // Crear un nuevo usuario
    @PostMapping("empleados")
    public ResponseEntity<EmpleadoDTO> crearEmpleado(@RequestBody EmpleadoDTO empleadoDTO) {
        EmpleadoDTO creado = empleadoService.guardar(empleadoDTO);
        return ResponseEntity.ok(creado);
    }

    @PutMapping("empleados/{id}")
    public ResponseEntity<EmpleadoDTO> actualizarEmpleado(@PathVariable Long id, @RequestBody EmpleadoDTO empleadoDTO) {
        return empleadoService.actualizar(id, empleadoDTO)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Eliminar usuario por ID
    @DeleteMapping("empleados/{id}")
    public ResponseEntity<String> eliminarEmpleado(@PathVariable Long id) {
        empleadoService.eliminar(id);
        return ResponseEntity.ok("El registro ID: " + id + " se eliminó correctamente");
    }
}
