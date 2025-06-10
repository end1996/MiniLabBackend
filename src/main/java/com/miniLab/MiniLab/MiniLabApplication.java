package com.miniLab.MiniLab;

import com.miniLab.MiniLab.model.Empleado;
import com.miniLab.MiniLab.repository.EmpleadoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MiniLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniLabApplication.class, args);
	}

	@Bean
	CommandLineRunner run(EmpleadoRepository repo) {
		return args -> {
			Empleado e = new Empleado();
			e.setNombre("Juan");
			e.setApellido("Pérez");
			repo.save(e);
		};
	}
}
