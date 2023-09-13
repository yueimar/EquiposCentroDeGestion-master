package com.app.IngresoEquipos.IngresoEquipos;

import com.app.IngresoEquipos.IngresoEquipos.repositorio.EquiposRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IngresoEquiposApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(IngresoEquiposApplication.class, args);
	}

	@Autowired
	private EquiposRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {
		/*
		Equipos equipos1 = new Equipos("Antena Ac","Rocket Prismiam Gen2","9.9.10.196");
		repositorio.save(equipos1);

		Equipos equipos2 = new Equipos("Antena M5","Lite Beam M5","9.9.10.197");
		repositorio.save(equipos2);
		 */
	}
}
