package com.miniLab.MiniLab.service.impl;

import com.miniLab.MiniLab.DTO.OrdenProduccionDTO;
import com.miniLab.MiniLab.mapper.OrdenProduccionMapper;
import com.miniLab.MiniLab.model.OrdenProduccion;
import com.miniLab.MiniLab.repository.OrdenProduccionRepository;
import com.miniLab.MiniLab.service.OrdenProduccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OrdenProduccionServiceImpl implements OrdenProduccionService {
    @Autowired
    private OrdenProduccionRepository ordenProduccionRepository;

    @Override
    public OrdenProduccionDTO guardar(OrdenProduccionDTO opDTO) {
        OrdenProduccion op = OrdenProduccionMapper.toEntity(opDTO);
        OrdenProduccion guardado = ordenProduccionRepository.save(op);
        return OrdenProduccionMapper.toDTO(guardado);
    }

    @Override
    public List<OrdenProduccionDTO> listarTodos() {
        return ordenProduccionRepository.findAll()
                .stream()
                .map(OrdenProduccionMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<OrdenProduccionDTO> buscarPorId(Long id) {
        return ordenProduccionRepository.findById(id)
                .map(OrdenProduccionMapper::toDTO);
    }

    @Override
    public Optional<OrdenProduccionDTO> actualizar(Long id, OrdenProduccionDTO opDTO) {
        return ordenProduccionRepository.findById(id).map(existente -> {
            OrdenProduccion op = OrdenProduccionMapper.toEntity(opDTO);
            op.setId(id); // aseguramos que se actualice el existente
            OrdenProduccion actualizado = ordenProduccionRepository.save(op);
            return OrdenProduccionMapper.toDTO(actualizado);
        });
    }

    @Override
    public void eliminar(Long id) {
        ordenProduccionRepository.deleteById(id);
    }
}
