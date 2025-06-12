package com.miniLab.MiniLab.mapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import com.miniLab.MiniLab.dto.ClienteDTO;
import com.miniLab.MiniLab.model.Cliente;
import com.miniLab.MiniLab.model.Responsable;

@Component
public class ClienteMapper {

	// MAPEAR DE ENTIDAD A UNA LISTA DTO
	public List<ClienteDTO> DtoList( List<Cliente> lstCliente ){
		if ( lstCliente == null ) return Collections.emptyList();
		
		List<ClienteDTO> lstClienteDto = new ArrayList<>();
		
		for ( Cliente cliente : lstCliente ) {
			ClienteDTO clienteDto = entityToDto(cliente);
			
			if ( clienteDto != null ) lstClienteDto.add(clienteDto);
		}
		
		return lstClienteDto;
	}
	
	// MAPEAR DE UNA ENTIDAD A DTO
	public ClienteDTO entityToDto(Cliente cliente) {
		if ( cliente == null || cliente.getResponsable() == null ) return null;
		
		ClienteDTO cDto = new ClienteDTO();
		cDto.setClienteId( cliente.getId() );
		cDto.setDireccion( cliente.getDireccion() );
		
		cDto.setResponsableId( cliente.getResponsable().getId() );
		cDto.setNombre( cliente.getResponsable().getNombre() );
		cDto.setApellido( cliente.getResponsable().getApellido() );
		cDto.setContacto( cliente.getResponsable().getContacto() );
		cDto.setDni( cliente.getResponsable().getDni() );
		
		return cDto;
	}
	
	// MAPEAR DE DTO A ENTIDAD
	public Cliente dtoToEntity( ClienteDTO clienteDto ) {
		if ( clienteDto == null ) return null;
		
		Cliente cliente = new Cliente();
		Responsable responsable = new Responsable();
		
		if ( clienteDto.getClienteId() != null ) cliente.setId( clienteDto.getClienteId() );
		cliente.setDireccion( clienteDto.getDireccion() );
		responsable.setId( clienteDto.getResponsableId() );
		cliente.setResponsable(responsable);
		
		return cliente;
	}
	
}
