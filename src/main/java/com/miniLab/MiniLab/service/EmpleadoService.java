package com.miniLab.MiniLab.service;

import com.miniLab.MiniLab.DTO.EmpleadoDTO;

import java.util.List;
import java.util.Optional;

public interface EmpleadoService {
    EmpleadoDTO guardar(EmpleadoDTO empleadoDTO);
    List<EmpleadoDTO> listarTodos();
    Optional<EmpleadoDTO> buscarPorId(Long id);
    Optional<EmpleadoDTO> actualizar(Long id, EmpleadoDTO dto);
    void eliminar(Long id);
}
