package com.it4045.pokemonviewer.enterprise.dto;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public @Data
class Pokemon {

    private int id;
    private String number;
    private String name;
    private String img;
    private List<String> type;
    private String height;
    private String weight;
    private String candy;
    private String egg;
    private double spawnChoice;
    private double avgSpawns;
    private String spawnTime;
    private List<Double> multipliers;
    private List<String> weakness;
    private List<Map.Entry<Pokemon, String>> previousEvolution;
    private List<Map.Entry<Pokemon, String>> nextEvolution;

    public Pokemon(){ }

    public Pokemon(String name, String image, List<String> weakness, List<String> type, String spawnTime) {
        this.name = name;
        this.img = image;
        this.weakness = weakness;
        this.type = type;
        this.spawnTime =spawnTime;
    }

    public Pokemon(String name, String image, List<Map.Entry<Pokemon, String>> previousEvolution, List<Map.Entry<Pokemon, String>> nextEvolution) {
        this.name = name;
        this.img = image;
        this.weakness = weakness;
        this.type = type;
        this.spawnTime =spawnTime;

        this.previousEvolution = previousEvolution;
        this.nextEvolution = nextEvolution;
    }
}