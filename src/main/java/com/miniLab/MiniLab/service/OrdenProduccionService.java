package com.miniLab.MiniLab.service;

import com.miniLab.MiniLab.DTO.OrdenProduccionDTO;

import java.util.List;
import java.util.Optional;

public interface OrdenProduccionService {
    OrdenProduccionDTO guardar(OrdenProduccionDTO opDTO);
    List<OrdenProduccionDTO> listarTodos();
    Optional<OrdenProduccionDTO> buscarPorId(Long id);
    Optional<OrdenProduccionDTO> actualizar(Long id, OrdenProduccionDTO dto);
    void eliminar(Long id);
}
