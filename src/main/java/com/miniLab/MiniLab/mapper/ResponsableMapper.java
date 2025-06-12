package com.miniLab.MiniLab.mapper;

import org.springframework.stereotype.Component;

import com.miniLab.MiniLab.dto.ClienteDTO;
import com.miniLab.MiniLab.dto.EntidadDTO;
import com.miniLab.MiniLab.model.Responsable;

@Component
public class ResponsableMapper {

	// MAPEAR DEL DTO CLIENTE AL MODELO RESPONSABLE
	public Responsable dtoToEntity( ClienteDTO cDto) {
		if ( cDto == null ) return null;
		
		Responsable responsable = new Responsable();
		if ( cDto.getResponsableId() != null) responsable.setId( cDto.getResponsableId() );
		responsable.setNombre( cDto.getNombre() );
		responsable.setApellido( cDto.getApellido() );
		responsable.setTipoCliente( cDto.isTipoCliente() );
		responsable.setDni( cDto.getDni() );
		
		return responsable;
	}
	
	// MAPEAR DEL DTO ENTIDAD AL MODELO RESPONSABLE
		public Responsable dtoToEntity( EntidadDTO eDto) {
			if ( eDto == null ) return null;
			
			Responsable responsable = new Responsable();
			if ( eDto.getResponsableId() != null) responsable.setId( eDto.getResponsableId() );
			responsable.setNombre( eDto.getNombre() );
			responsable.setApellido( eDto.getApellido() );
			responsable.setTipoCliente( eDto.isTipoCliente() );
			responsable.setDni( eDto.getDni() );
			
			return responsable;
		}
	
}
