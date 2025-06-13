package com.miniLab.MiniLab.mapper;

import com.miniLab.MiniLab.DTO.OrdenProduccionDTO;
import com.miniLab.MiniLab.model.OrdenProduccion;

public class OrdenProduccionMapper {
    public static OrdenProduccionDTO toDTO(OrdenProduccion op) {
        return new OrdenProduccionDTO(
                op.getId(),
                op.getCantidad_cuadros(),
                op.getFecha_inicio(),
                op.isEstado(),
                op.getObservaciones(),
                op.getEmpleado().getId()
        );
    }

    public static OrdenProduccion toEntity(OrdenProduccionDTO dto) {
        OrdenProduccion op = new OrdenProduccion();
        op.setId(op.getId());
        op.setCantidad_cuadros(dto.getCantidad_cuadros());
        op.setFecha_inicio(dto.getFecha_inicio());
        op.setEstado(dto.isEstado());
        op.setObservaciones(op.getObservaciones());
        return op;
    }
}

