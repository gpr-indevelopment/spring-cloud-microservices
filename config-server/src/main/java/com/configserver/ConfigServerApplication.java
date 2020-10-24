package com.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

	// Consultar valores das configurações!
	// http://localhost:8888/limits-service/default
	// http://localhost:8888/limits-service/qa
	// http://localhost:8888/limits-service/dev
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
