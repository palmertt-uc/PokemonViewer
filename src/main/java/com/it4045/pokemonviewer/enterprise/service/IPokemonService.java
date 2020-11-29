package com.it4045.pokemonviewer.enterprise.service;

import com.it4045.pokemonviewer.enterprise.dto.Pokemon;

import java.io.IOException;
import java.util.List;

public interface IPokemonService {

    Pokemon fetchByName(String pokemonName);
    List<Pokemon> fetchPokemons() throws IOException;
}
