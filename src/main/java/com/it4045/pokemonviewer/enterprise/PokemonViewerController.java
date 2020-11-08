package com.it4045.pokemonviewer.enterprise;

import com.it4045.pokemonviewer.enterprise.service.IPokemonService;
import com.it4045.pokemonviewer.enterprise.dto.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/**
 * Hero is the main entity we'll be using to . . .
 *
 * @author Captain America
 * Handle all Mapping for Pokemon View
 */
@Controller
public class PokemonViewerController {

    @Autowired
    IPokemonService pokemonService;

    /**
     * <p>This is a simple description of the method.</p>
     * @param model
     * @return index.html fire as long as there is no exception
     */
    @RequestMapping("/")
    public String index(Model model) throws IOException {
        try {
            List<Pokemon> pokemons = pokemonService.fetchPokemons();
            model.addAttribute("allPokemon", pokemons);
            return "index";
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * <p>This is a simple description of the method.</p>
     * takes no params
     * @return A list of pokemon objects from the Pokemon Service class
     */
    @GetMapping("/pokemons")
    public ResponseEntity getPokemon() {
        try {
            List<Pokemon> pokemons = pokemonService.fetchPokemons();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            return new ResponseEntity(pokemons, headers, HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
