package com.capgemini.configservermmbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerMmbankApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerMmbankApplication.class, args);
	}

}

