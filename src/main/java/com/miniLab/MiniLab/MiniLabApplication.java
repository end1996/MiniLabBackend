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
}
