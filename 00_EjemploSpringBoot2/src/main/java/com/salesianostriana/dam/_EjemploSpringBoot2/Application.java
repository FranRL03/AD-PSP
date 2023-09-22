package com.salesianostriana.dam._EjemploSpringBoot2;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner runner (Servicio servicio){
		return args -> {
			/* for (String s : ctx.getBeanDeinirionNames()){

			} */

			servicio.run();
		};
	}
}
