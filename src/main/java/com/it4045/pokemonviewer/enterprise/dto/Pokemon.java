package com.it4045.pokemonviewer.enterprise.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.lang.reflect.Type;
import java.util.List;

public @Data
class Pokemon {

    @SerializedName("id")
    private int id;
    @SerializedName("num")
    private int number;
    @SerializedName("name")
    private String name;
    @SerializedName("img")
    private String img;
    @SerializedName("type")
    private List<String> type;
    @SerializedName("height")
    private double height;
    @SerializedName("weight")
    private double weight;
    @SerializedName("candy")
    private String candy;
    @SerializedName("egg")
    private String egg;
    @SerializedName("spawn_choice")
    private double spawnChoice;
    @SerializedName("avg_spawns")
    private double avgSpawns;
    @SerializedName("spawn_time")
    private String spawnTime;
    @SerializedName("multipliers")
    private List<Double> multipliers;
    @SerializedName("weakness")
    private List<Weakness> weakness;
    @SerializedName("next_evolution")
    private List<Evolution> nextEvolution;
    @SerializedName("prev_evolution")
    private List<Evolution> prevEvolution;

    public Pokemon(){ }

    public Pokemon(String name, String image, List<Weakness> weakness, List<String> type, String spawnTime) {
        this.name = name;
        this.img = image;
        this.weakness = weakness;
        this.type = type;
        this.spawnTime =spawnTime;
    }
}
