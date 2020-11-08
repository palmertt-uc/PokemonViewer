package com.it4045.pokemonviewer.enterprise.service;

import com.it4045.pokemonviewer.enterprise.dao.IPokemonDAO;
import com.it4045.pokemonviewer.enterprise.dto.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class PokemonServiceStub implements IPokemonService{

    @Autowired
    private IPokemonDAO pokemonDAO;

    private final Pokemon pokemon = new Pokemon();

    /**
     * Currently used in unit tests
     */
    @Override
    public Pokemon fetchByName(String pokemonName) {
        pokemon.setPokemonName("Charizard");
        pokemon.setPokemonId(1);
        return pokemon;
    }

    @Override
    public List<Pokemon> fetchPokemons() throws IOException {
        return pokemonDAO.fetchAllPokemons();
    }

    @Override
    public void savePokemon(Pokemon pokemon) {
        pokemonDAO.save(pokemon);
    }

    @Override
    public void deletePokemon(int id) {
        pokemonDAO.delete(id);
    }
}
