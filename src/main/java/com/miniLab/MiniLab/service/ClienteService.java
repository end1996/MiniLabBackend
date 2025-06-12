package com.miniLab.MiniLab.service;

import java.util.List;

import com.miniLab.MiniLab.dto.ClienteDTO;

public interface ClienteService {

	List<ClienteDTO> getClientes();
	
	ClienteDTO saveCliente( ClienteDTO cDto );
	
	String deleteCliente( Long id );
	
}
