package com.example.rickandmorty.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CharacterCard {
    public int id;
    public String name;
    public String status;
    public String species;
    public String image;

    //public CharacterOrigin origin;
}
