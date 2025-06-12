package com.miniLab.MiniLab.mapper;

import com.miniLab.MiniLab.DTO.EmpleadoDTO;
import com.miniLab.MiniLab.model.Empleado;

public class EmpleadoMapper {

    public static EmpleadoDTO toDTO(Empleado empleado) {
        return new EmpleadoDTO(
                empleado.getId(),
                empleado.getNombre(),
                empleado.getApellido(),
                empleado.getDireccion(),
                empleado.getContacto(),
                empleado.getRol_operativo(),
                empleado.getDni(),
                empleado.getFecha_ingreso(),
                empleado.getEmail(),
                empleado.isActivo()
        );
    }

    public static Empleado toEntity(EmpleadoDTO dto) {
        Empleado empleado = new Empleado();
        empleado.setId(dto.getId());
        empleado.setNombre(dto.getNombre());
        empleado.setApellido(dto.getApellido());
        empleado.setDireccion(dto.getDireccion());
        empleado.setContacto(dto.getContacto());
        empleado.setRol_operativo(dto.getRol_operativo());
        empleado.setDni(dto.getDni());
        empleado.setFecha_ingreso(dto.getFecha_ingreso());
        empleado.setEmail(dto.getEmail());
        empleado.setActivo(dto.isActivo());
        return empleado;
    }
}
