package com.example.rickandmorty.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Home {
    public String characters;
    public String locations;
    //public String episodes;

    public String getCharacters() {
        return characters;
    }

    public void setCharacters(String characters) {
        this.characters = characters;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    //public String getEpisodes() {return episodes;}

    //public void setEpisodes(String episodes) {this.episodes = episodes;}
}
