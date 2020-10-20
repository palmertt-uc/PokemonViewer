package com.it4045.pokemonviewer.enterprise.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import java.util.List;

public @Data
class Pokedex {

    @SerializedName("pokemon")
    private List<Pokemon> pokemon;
}
