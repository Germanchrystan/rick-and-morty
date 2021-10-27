package com.example.rickandmorty.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CharacterResults {
    public CharacterCard[] results;

    public CharacterCard[] getResults() {
        return results;
    }

    public void setResults(CharacterCard[] results) {
        this.results = results;
    }
}
