package com.example.rickandmorty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableAsync
public class RickAndMortyApplication {
	@Bean
	public WebClient.Builder getRestTemplate() {
		return WebClient.builder();
	}

	public static void main(String[] args) {
		SpringApplication.run(RickAndMortyApplication.class, args);
	}

}
