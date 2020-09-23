package com.it4045.pokemonviewer.enterprise.service;

import com.it4045.pokemonviewer.enterprise.dto.Pokemon;

public interface IPokemonService {

    Pokemon fetchByName(String pokemonName);
}
