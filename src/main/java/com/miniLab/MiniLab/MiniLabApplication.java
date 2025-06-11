package com.miniLab.MiniLab;

import com.miniLab.MiniLab.model.Empleado;
import com.miniLab.MiniLab.repository.EmpleadoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Date;

@SpringBootApplication
public class MiniLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniLabApplication.class, args);
	}

	@Bean
	CommandLineRunner run(EmpleadoRepository repo) {
		return args -> {
			Empleado e = new Empleado();
			e.setNombre("Pedro");
			e.setApellido("Pascal");
			e.setContacto("971235952");
			e.setFecha_ingreso(Date.valueOf("2025-06-11"));
			e.setDni("08985786");
			e.setRol_operativo("Operador");
			e.setActivo(true);
			repo.save(e);
		};
	}
}
