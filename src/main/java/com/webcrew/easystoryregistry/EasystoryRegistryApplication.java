package com.webcrew.easystoryregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EasystoryRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasystoryRegistryApplication.class, args);
	}

}
