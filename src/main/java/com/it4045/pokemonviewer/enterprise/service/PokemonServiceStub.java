package com.it4045.pokemonviewer.enterprise.service;

import com.it4045.pokemonviewer.enterprise.dao.IPokemonDAO;
import com.it4045.pokemonviewer.enterprise.dto.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
        pokemon.setName("Charizard");
        pokemon.setId(1);
        pokemon.setAvgSpawns(0.31);
        return pokemon;
    }

    @Override
    public List<Pokemon> fetchPokemons() throws IOException {
        return pokemonDAO.fetchAllPokemons();
    }

    @Override
    public void delete(int id) {

    }
}
