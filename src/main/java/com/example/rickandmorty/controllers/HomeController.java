package com.example.rickandmorty.controllers;

import com.example.rickandmorty.models.Home;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/")
@AllArgsConstructor
public class HomeController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    public Home getHome() {
        return restTemplate.getForObject("https://rickandmortyapi.com/api", Home.class);
    }

}
