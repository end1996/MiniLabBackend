package com.miniLab.MiniLab.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniLab.MiniLab.dto.ClienteDTO;
import com.miniLab.MiniLab.mapper.ClienteMapper;
import com.miniLab.MiniLab.mapper.ResponsableMapper;
import com.miniLab.MiniLab.model.Cliente;
import com.miniLab.MiniLab.model.Responsable;
import com.miniLab.MiniLab.repository.ClienteRepository;
import com.miniLab.MiniLab.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ClienteMapper clienteMapper;
	
	@Autowired
	private ResponsableMapper responsableMapper;
	
	@Autowired
	private ResponsableServiceImpl responsableServiceImpl;
	
	// OBTENER UNA LISTA DE REGISTROS DE CLIENTES
	@Override
	public List<ClienteDTO> getClientes() {
		List<ClienteDTO> lstCliente = clienteMapper.DtoList( clienteRepository.findAll() );
		return lstCliente;
	}

	// GUARDAR UN CLIENTE
	@Override
	public ClienteDTO saveCliente(ClienteDTO cDto) {
		
		if ( cDto.isTipoCliente() ) { // Si el responsable es un Cliente
			Responsable responsable = responsableMapper.dtoToEntity(cDto);
			this.responsableServiceImpl.saveResponsable(responsable);
		}
		
		Cliente cliente = clienteRepository.save( clienteMapper.dtoToEntity(cDto) );
		return clienteMapper.entityToDto(cliente);
	}

	// ELIMINAR UN CLIENTE SEGUN LA ID PROPORCIONADA
	@Override
	public String deleteCliente(Long id) {
		this.clienteRepository.deleteById(id);
		return "Registro Eliminado correctamente";
	}

}
