package com.capgemini.eurekaservermmbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerMmbankApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerMmbankApplication.class, args);
	}

}

