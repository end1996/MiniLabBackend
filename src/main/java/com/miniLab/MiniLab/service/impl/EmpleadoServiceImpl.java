package com.miniLab.MiniLab.service.impl;

import com.miniLab.MiniLab.DTO.EmpleadoDTO;
import com.miniLab.MiniLab.mapper.EmpleadoMapper;
import com.miniLab.MiniLab.model.Empleado;
import com.miniLab.MiniLab.repository.EmpleadoRepository;
import com.miniLab.MiniLab.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public EmpleadoDTO guardar(EmpleadoDTO empleadoDTO) {
        Empleado empleado = EmpleadoMapper.toEntity(empleadoDTO);
        Empleado guardado = empleadoRepository.save(empleado);
        return EmpleadoMapper.toDTO(guardado);
    }

    @Override
    public List<EmpleadoDTO> listarTodos() {
        return empleadoRepository.findAll()
                .stream()
                .map(EmpleadoMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<EmpleadoDTO> buscarPorId(Long id) {
        return empleadoRepository.findById(id)
                .map(EmpleadoMapper::toDTO);
    }

    @Override
    public Optional<EmpleadoDTO> actualizar(Long id, EmpleadoDTO empleadoDTO) {
        return empleadoRepository.findById(id).map(existente -> {
            Empleado empleado = EmpleadoMapper.toEntity(empleadoDTO);
            empleado.setId(id); // aseguramos que se actualice el existente
            Empleado actualizado = empleadoRepository.save(empleado);
            return EmpleadoMapper.toDTO(actualizado);
        });
    }

    @Override
    public void eliminar(Long id) {
        empleadoRepository.deleteById(id);
    }
}
