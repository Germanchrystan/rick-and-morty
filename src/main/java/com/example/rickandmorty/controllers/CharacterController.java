package com.example.rickandmorty.controllers;


import com.example.rickandmorty.models.CharacterDetails;
import com.example.rickandmorty.models.CharacterResults;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;


@RestController
@RequestMapping("/api/characters")
@AllArgsConstructor
public class CharacterController {
    @Autowired
    private WebClient.Builder webClientBuilder;

    @GetMapping
    public CharacterResults getAllCharacters() {
        CharacterResults response =
                webClientBuilder.build()
                        .get()
                        .uri("https://rickandmortyapi.com/api/character")
                        .retrieve()
                        .bodyToMono(CharacterResults.class)
                        .block();
        //List<Character> c = Arrays.asList(characters);
        return response;
    }

    @GetMapping("/{id}")
    public CharacterDetails getCharacterById(@PathVariable int id){
        CharacterDetails response = webClientBuilder.build()
                .get()
                .uri("https://rickandmortyapi.com/api/character/" + id)
                .retrieve()
                .bodyToMono(CharacterDetails.class)
                .block();
        return response;
    }
}
