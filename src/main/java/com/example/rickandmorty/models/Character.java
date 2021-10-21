package com.example.rickandmorty.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Character {
    public int id;
    public String name;
    public String status;
    public String species;
    public String image;
}
