package br.com.fiap.sprint_admin;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
@EnableAdminServer
@SpringBootApplication
public class SprintAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintAdminApplication.class, args);
	}

}
