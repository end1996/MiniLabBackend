package com.miniLab.MiniLab.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "Responsable")
public class Responsable {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	
	private String nombre;
	
	private String apellido;
	
	@Column(name = "Tipo_cliente")
	private boolean tipoCliente;
	
	private String contacto;
	
	private String dni;
	
}
