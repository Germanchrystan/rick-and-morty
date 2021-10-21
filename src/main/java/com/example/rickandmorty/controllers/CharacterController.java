package com.example.rickandmorty.controllers;

import com.example.rickandmorty.models.Character;
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


@RestController
@RequestMapping("/api/characters")
@AllArgsConstructor
public class CharacterController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    public CharacterResults getAllCharacters() {
        ResponseEntity<CharacterResults> response =
                restTemplate.getForEntity(
                        "https://rickandmortyapi.com/api/character",
                        CharacterResults.class);
        CharacterResults characters = response.getBody();
        //List<Character> c = Arrays.asList(characters);
        return  characters;
    }

    @GetMapping("/{id}")
    public Character getCharacterById(@PathVariable int id){
        ResponseEntity<Character> response =
                restTemplate.getForEntity(
                        "https://rickandmortyapi.com/api/character/" + id,
                        Character.class);
        Character characters = response.getBody();
        //List<Character> c = Arrays.asList(characters);
        return  characters;
    }
}
