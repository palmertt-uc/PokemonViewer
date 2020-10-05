package com.it4045.pokemonviewer.enterprise.dto;

import lombok.Data;
import java.util.List;

public @Data
class Pokedex {

    private List<Pokemon> pokemon;
}
