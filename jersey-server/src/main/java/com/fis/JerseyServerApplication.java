package com.fis;

import com.fis.resource.WelcomeResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JerseyServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JerseyServerApplication.class, args);
	}

	@Bean
	ResourceConfig resourceConfig()
	{
		return new ResourceConfig(WelcomeResource.class);
	}
}
