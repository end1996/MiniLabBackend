package com.miniLab.MiniLab.service.impl;

import com.miniLab.MiniLab.DTO.UsuarioDTO;
import com.miniLab.MiniLab.mapper.UsuarioMapper;
import com.miniLab.MiniLab.model.Usuario;
import com.miniLab.MiniLab.repository.UsuarioRepository;
import com.miniLab.MiniLab.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UsuarioDTO guardar(UsuarioDTO usuarioDTO) {
        Usuario usuario = UsuarioMapper.toEntity(usuarioDTO);
        Usuario guardado = usuarioRepository.save(usuario);
        return UsuarioMapper.toDTO(guardado);
    }

    @Override
    public List<UsuarioDTO> listarTodos() {
        return usuarioRepository.findAll()
                .stream()
                .map(UsuarioMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<UsuarioDTO> buscarPorId(Long id) {
        return usuarioRepository.findById(id)
                .map(UsuarioMapper::toDTO);
    }

    @Override
    public Optional<UsuarioDTO> actualizar(Long id, UsuarioDTO usuarioDTO) {
        return usuarioRepository.findById(id).map(existente -> {
            Usuario usuario = UsuarioMapper.toEntity(usuarioDTO);
            usuario.setId(id); // aseguramos que se actualice el existente
            Usuario actualizado = usuarioRepository.save(usuario);
            return UsuarioMapper.toDTO(actualizado);
        });
    }

    @Override
    public void eliminar(Long id) {
        usuarioRepository.deleteById(id);
    }
}
