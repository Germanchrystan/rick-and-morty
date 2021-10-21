package com.example.rickandmorty.controllers;

import com.example.rickandmorty.models.Character;
import com.example.rickandmorty.models.Home;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class HomeController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    public Home getHome() throws Exception {
        return restTemplate.getForObject("https://rickandmortyapi.com/api", Home.class);
    }

}
