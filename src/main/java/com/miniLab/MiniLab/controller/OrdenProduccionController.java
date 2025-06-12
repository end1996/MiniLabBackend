package com.miniLab.MiniLab.controller;

import com.miniLab.MiniLab.DTO.OrdenProduccionDTO;
import com.miniLab.MiniLab.service.OrdenProduccionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class OrdenProduccionController {

    private final OrdenProduccionService ordenProduccionService;

    public OrdenProduccionController(OrdenProduccionService ordenProduccionService) {
        this.ordenProduccionService = ordenProduccionService;
    }

    // Listar todos las ordenes de produccion
    @GetMapping("ordenes_produccion")
    public List<OrdenProduccionDTO> listarOrdenesProduccion() {
        return ordenProduccionService.listarTodos();
    }

    // Crear una nueva orden de produccion
    @PostMapping("ordenes_produccion")
    public ResponseEntity<OrdenProduccionDTO> crearOrdenesProduccion(@RequestBody OrdenProduccionDTO opDTO) {
        OrdenProduccionDTO creado = ordenProduccionService.guardar(opDTO);
        return ResponseEntity.ok(creado);
    }

    @PutMapping("ordenes_produccion/{id}")
    public ResponseEntity<OrdenProduccionDTO> actualizarOrdenesProduccion(@PathVariable Long id, @RequestBody OrdenProduccionDTO opDTO) {
        return ordenProduccionService.actualizar(id, opDTO)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Eliminar orden produccion por ID
    @DeleteMapping("ordenes_produccion/{id}")
    public ResponseEntity<String> eliminarOrdenesProduccion(@PathVariable Long id) {
        ordenProduccionService.eliminar(id);
        return ResponseEntity.ok("El registro ID: " + id + " se eliminó correctamente");
    }
}
