package com.it4045.pokemonviewer.enterprise.dao;

import com.it4045.pokemonviewer.enterprise.dto.Pokemon;
import retrofit2.http.GET;
import retrofit2.Call;

import java.util.List;
import java.util.Map;

public interface IPokemonRetrofitDAO {
    @GET("/Biuni/PokemonGO-Pokedex/master/pokedex.json")
    Call<Map<String, Object>> getPokemons();
}
