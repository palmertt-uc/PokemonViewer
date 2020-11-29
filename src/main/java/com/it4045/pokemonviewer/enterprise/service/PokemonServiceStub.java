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
        pokemon.setName("Charizard");
        pokemon.setId(1);
        return pokemon;
    }

    @Override
    public Pokemon fetchByNumber(int pokemonNumber) {
        pokemon.setPokemonNumber("3");
        return pokemon;
    }

    @Override
    public List<Pokemon> fetchPokemons() throws IOException {
        return pokemonDAO.fetchAllPokemons();
    }
}
