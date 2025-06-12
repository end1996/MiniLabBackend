package com.miniLab.MiniLab.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ClienteDTO extends ResponsableDTO {

	Long clienteId;
	String direccion;
	
}
