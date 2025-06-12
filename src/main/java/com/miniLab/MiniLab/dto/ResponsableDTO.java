package com.miniLab.MiniLab.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ResponsableDTO {

	Long responsableId;
	String nombre;
	String apellido;
	boolean tipoCliente;
	String contacto;
	String dni;
	
}
