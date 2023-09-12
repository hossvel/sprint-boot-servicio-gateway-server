package com.devhoss.app.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SprintBootServicioGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintBootServicioGatewayServerApplication.class, args);
	}

}
