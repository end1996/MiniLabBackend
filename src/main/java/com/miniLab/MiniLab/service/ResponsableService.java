package com.miniLab.MiniLab.service;

import com.miniLab.MiniLab.model.Responsable;

public interface ResponsableService {
	
	void saveResponsable( Responsable responsable );
	
	String deleteResponsable( Long id );
	
}
