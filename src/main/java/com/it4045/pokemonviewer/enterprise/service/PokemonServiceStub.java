package com.it4045.pokemonviewer.enterprise.service;

import com.it4045.pokemonviewer.enterprise.dto.Pokemon;
import org.springframework.stereotype.Component;

@Component
public class PokemonServiceStub implements IPokemonService{

    private final Pokemon pokemon = new Pokemon();

    @Override
    public Pokemon fetchByName(String pokemonName) {
        pokemon.setPokemonName("Charizard");
        pokemon.setPokemonId(1);
        return pokemon;
    }
}
