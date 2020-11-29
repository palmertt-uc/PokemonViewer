package com.it4045.pokemonviewer.enterprise.dao;

import retrofit2.http.GET;
import retrofit2.Call;
import java.util.Map;

public interface IPokemonRetrofitDAO {
    @GET("/Biuni/PokemonGO-Pokedex/master/pokedex.json")
    Call<Map<String, Object>> getPokemons();
}
