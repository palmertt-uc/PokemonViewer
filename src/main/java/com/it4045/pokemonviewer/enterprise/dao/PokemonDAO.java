package com.it4045.pokemonviewer.enterprise.dao;

import com.it4045.pokemonviewer.enterprise.dto.Pokemon;
import org.springframework.stereotype.Repository;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.Call;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Repository
public class PokemonDAO implements IPokemonDAO {
    @Override
    public List<Pokemon> fetchAllPokemons() throws IOException {
        Retrofit retrofitInstance = RetrofitClientInstance.getRetroFitInstance();
        IPokemonRetrofitDAO pokemonRetrofitDAO = retrofitInstance.create(IPokemonRetrofitDAO.class);
        Call<Map<String, Object>> allPokemons = pokemonRetrofitDAO.getPokemons();
        Response<Map<String, Object>> execute = allPokemons.execute();
        Map<String, Object> pokemons = execute.body();
        List<Pokemon> pokemonList = (List<Pokemon>) pokemons.get("pokemon");
        return pokemonList;
    }

    public Pokemon fetch(int id) {

        return new Pokemon();
    }

    public Pokemon save(Pokemon pokemon) {
        return new Pokemon();
    }

    public void delete(int id) {

    }

}
