package com.it4045.pokemonviewer.enterprise.service;

import com.it4045.pokemonviewer.enterprise.dto.Pokemon;

import java.util.List;

public interface IPokemonService {
    /**
     * Fetches pokemon by name.
     * @param pokemonName
     * @return Pokemon
     */
    Pokemon fetchByName(String pokemonName);

    /**
     * Fetches all Pokemon
     * @return List<Pokemon>
     */
    List<Pokemon> fetchAllPokemon();
}
