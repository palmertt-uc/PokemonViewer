package com.it4045.pokemonviewer.enterprise;

import com.it4045.pokemonviewer.enterprise.dto.Pokemon;
import com.it4045.pokemonviewer.enterprise.service.IPokemonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EnterpriseApplicationTests {

    @Autowired
    private IPokemonService pokemonService;
    private Pokemon pokemon;

    @Test
    public void contextLoads() {
    }

    @Test
    void fetchPokemonByName_returnsCharizard() {
        givenPokemonDataIsReadilyAvailable();
        whenSearchPokemonWithNameCharizard();
        thenReturnOnePokemonWithNameCharizard();
    }

    @Test
    void fetchPokemonByName_returnsNothing() {
        givenPokemonDataIsReadilyAvailable();
        whenSearchPokemonWithNameBurgers();
        thenReturnNothing();
    }

    @Test
    void fetchPokemonByName_returnsCharizardId() {
        givenPokemonDataIsReadilyAvailable();
        whenSearchPokemonWithNameCharizard();
        thenReturnOnePokemonWithNameCharizard();
    }

    private void givenPokemonDataIsReadilyAvailable() { }

    private void thenReturnOnePokemonWithNameCharizard() {
        String pokemonName = pokemon.getPokemonName();
        assertEquals("Charizard", pokemonName);
    }

    private void whenSearchPokemonWithNameCharizard() {

        pokemon = pokemonService.fetchByName("Charizard");
        assertEquals("Charizard", pokemon.getPokemonName());
    }

    private void thenReturnNothing() {
        String pokemonName = pokemon.getPokemonName();
        assertNotEquals("Burgers", pokemonName);
    }

    private void whenSearchPokemonWithNameBurgers() {
        pokemon = pokemonService.fetchByName("Burgers");
    }

    private void thenReturnOnePokemonCharziardWithIdOne() {
        int pokemonId = pokemon.getPokemonId();
        assertEquals(5, pokemonId);
    }
}
