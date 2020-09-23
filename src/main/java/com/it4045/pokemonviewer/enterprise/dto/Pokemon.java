package com.it4045.pokemonviewer.enterprise.dto;

import lombok.Data;

import java.util.List;

public @Data
class Pokemon {

    private int pokemonId;
    private String pokemonNumber;
    private String pokemonName;
    private String pokemonImg;
    private List<String> pokemonType;
    private String pokemonHeight;
    private String pokemonWeight;
    private String pokemonCandy;
    private String pokemonEgg;
    private double pokemonSpawnChoice;
    private double pokemonAvgSpawns;
    private String pokemonSpawnTime;
    private List<Double> pokemonMultipliers;
    private List<String> pokemonWeakness;
    private List<Evolution> pokemonNextEvolution;
    private List<Evolution> pokemonPrevEvolution;
}
