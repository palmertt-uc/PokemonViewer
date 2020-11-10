package com.it4045.pokemonviewer.enterprise.dao;

import com.it4045.pokemonviewer.enterprise.dto.Pokemon;

import java.io.IOException;
import java.util.List;

public interface IPokemonDAO {
    List<Pokemon> fetchAllPokemons() throws IOException;
}
