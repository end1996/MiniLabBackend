package com.miniLab.MiniLab.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniLab.MiniLab.model.Responsable;
import com.miniLab.MiniLab.repository.ResponsableRepository;
import com.miniLab.MiniLab.service.ResponsableService;

@Service
public class ResponsableServiceImpl implements ResponsableService {

	@Autowired
	private ResponsableRepository repository;

	@Override
	public void saveResponsable(Responsable responsable) {
		this.repository.save(responsable);
	}

	@Override
	public String deleteResponsable(Long id) {
		this.repository.deleteById(id);
		return "Se elimino correctamente el registro";
	}
	
	
}
