package com.example.rickandmorty.controllers;

import com.example.rickandmorty.models.CharacterDetails;
import com.example.rickandmorty.models.Home;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;


@RestController
@RequestMapping("/")
@AllArgsConstructor
public class HomeController {

    @Autowired
    private WebClient.Builder webClientBuilder;


    @GetMapping
    public Home getHome() {
        return webClientBuilder.build()
                .get()
                .uri("https://rickandmortyapi.com/api")
                .retrieve()
                .bodyToMono(Home.class)
                .block();
    }

}
