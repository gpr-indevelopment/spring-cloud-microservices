package com.limitsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LimitsServiceApplication {

	// O limits service pega as configurações do config server na inicialização!
	// Ou seja, quando uma configuração muda, o config server fica automaticamente atualizado, mas as aplicações que o consomem não!
	// Verificar uma propriedade que renove a configuração lendo do config server periodicamente
	public static void main(String[] args) {
		SpringApplication.run(LimitsServiceApplication.class, args);
	}

}
