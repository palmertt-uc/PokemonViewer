package com.it4045.pokemonviewer.enterprise.service;

import com.it4045.pokemonviewer.enterprise.dto.Pokemon;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@Component
public class PokemonServiceStub implements IPokemonService{

    private final Pokemon pokemon = new Pokemon();
    private final List<Pokemon> pokemonList = new ArrayList<>();

    /**
     * Currently used in unit tests
     */
    @Override
    public Pokemon fetchByName(String pokemonName) {
        for( int i = 0; i < pokemonList.size(); i++ ) {
            if (pokemon.getPokemonName().equals(pokemonName)) {
                return pokemon;
            }
        }
        return null;
//      pokemon.setPokemonName("Charizard");
//      pokemon.setPokemonId(1);
//      return pokemon;
    }

    /**
     * Will be used once Pokemon API is called/connected
     */
    @Override
    public List<Pokemon> fetchAllPokemon() {
        return pokemonList;
    }
}
