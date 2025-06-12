package com.miniLab.MiniLab.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "Entidad")
public class Entidad {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	
	private String ruc;
	
	@Column(name = "razon_social")
	private String razonSocial;
	
	private String direccion;
	
	@OneToOne
	@JoinColumn(name = "responsable_id", referencedColumnName = "id")
	private Responsable responsable;
	
}
