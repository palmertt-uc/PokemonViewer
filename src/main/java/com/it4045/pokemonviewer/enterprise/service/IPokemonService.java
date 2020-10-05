package com.it4045.pokemonviewer.enterprise.service;

import com.it4045.pokemonviewer.enterprise.dto.Pokemon;

import java.util.List;

public interface IPokemonService {

    Pokemon fetchByName(String pokemonName);
    List<Pokemon> fetchAllPokemon();
}
