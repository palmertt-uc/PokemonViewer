package com.it4045.pokemonviewer.enterprise.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

public @Data
class Pokemon {

    @SerializedName("id")
    private int pokemonId;
    @SerializedName("num")
    private String pokemonNumber;
    @SerializedName("name")
    private String pokemonName;
    @SerializedName("img")
    private String pokemonImg;
    @SerializedName("type")
    private List<String> pokemonType;
    @SerializedName("height")
    private String pokemonHeight;
    @SerializedName("weight")
    private String pokemonWeight;
    @SerializedName("candy")
    private String pokemonCandy;
    @SerializedName("egg")
    private String pokemonEgg;
    @SerializedName("spawn_choice")
    private double pokemonSpawnChoice;
    @SerializedName("avg_spawns")
    private double pokemonAvgSpawns;
    @SerializedName("spawn_time")
    private String pokemonSpawnTime;
    @SerializedName("multipliers")
    private List<Double> pokemonMultipliers;
    @SerializedName("weakness")
    private List<String> pokemonWeakness;
    @SerializedName("next_evolution")
    private List<Evolution> pokemonNextEvolution;
    @SerializedName("prev_evolution")
    private List<Evolution> pokemonPrevEvolution;

    public Pokemon(){ }

    public Pokemon(String pokemonName, String image, List<String> weakness, List<String> type, String spawnTime) {
        this.pokemonName = pokemonName;
        this.pokemonImg = image;
        this.pokemonWeakness = weakness;
        this.pokemonType = type;
        this.pokemonSpawnTime =spawnTime;
    }
}
