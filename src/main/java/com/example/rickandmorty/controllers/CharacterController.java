package com.example.rickandmorty.controllers;

import com.example.rickandmorty.models.Character;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/api/characters/")
@AllArgsConstructor
public class CharacterController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    public List<Character> getAllCharacters() {
        ResponseEntity<Character[]> response =
                restTemplate.getForEntity(
                        "https://rickandmortyapi.com/api/character",
                        Character[].class);
        Character[] characters = response.getBody();
        List<Character> c = Arrays.asList(characters);
        return  c;

    }


}

/*
    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Quote quote = restTemplate.getForObject("https://quoters.apps.pcfone.io/api/random",
                    Quote.class);
            log.info(quote.toString());
            System.out.println(quote.toString());
        };
    }

    @Service
    public class MoviesService {
    @Autowired
    RestTemplate restTemplate;
    public List<Movie> getMovies(){
        ResponseEntity<Movie[]> response =
                  restTemplate.getForEntity(
                  "http://services-movies/api/movies/",
                  Movie[].class);
                Movie[] movies = response.getBody();
                List<Movie> m = Arrays.asList(movies);
        return  m;
    }
}

*/