package com.it4045.pokemonviewer.enterprise.ui;

import com.it4045.pokemonviewer.enterprise.dto.Pokemon;

import java.awt.Image;
import java.io.IOException;
import java.util.List;

public interface MapOfPokemon {
	
	Pokemon pokemon = new Pokemon();
	
	String pokemonName = pokemon.getPokemonName();
	Image pokemonImage = pokemon.getPokemonImg();
	String pokemontype = pokemon.getPokemonType();
	float pokemonSpawnChance = pokemon.getPokemonSpawnChance();
	String pokemonWeakness = pokemon.getPokemonWeakness();

}
