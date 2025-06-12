package com.miniLab.MiniLab.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class EntidadDTO extends ResponsableDTO {

	Long entidadId;
	String ruc;
	String razonSocial;
	String direccion;
	
}
