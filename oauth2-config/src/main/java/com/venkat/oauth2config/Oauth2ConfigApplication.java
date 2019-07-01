package com.venkat.oauth2config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class Oauth2ConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2ConfigApplication.class, args);
	}

}
