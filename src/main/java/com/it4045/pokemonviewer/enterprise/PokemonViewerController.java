package com.it4045.pokemonviewer.enterprise;

import com.it4045.pokemonviewer.enterprise.service.IPokemonService;
import com.it4045.pokemonviewer.enterprise.dto.Pokemon;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
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
import java.util.List;

@Controller
public class PokemonViewerController {

    @Autowired
    IPokemonService pokemonService;
    Logger logger = LoggerFactory.getLogger(PokemonViewerController.class);

    @RequestMapping("/")
    public String index(Model model) throws IOException {
        try {
            List<Pokemon> pokemons = pokemonService.fetchPokemons();
            model.addAttribute("allPokemon", pokemons);
            return "index";
        } catch (IOException e) {
            logger.trace("Index Page IOException exception: " + e);
            e.printStackTrace();
            return "error";
        }
    }

    @GetMapping("/pokemons")
    public ResponseEntity getPokemon() {
        try {
            List<Pokemon> pokemons = pokemonService.fetchPokemons();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            return new ResponseEntity(pokemons, headers, HttpStatus.OK);
        } catch (IOException e) {
            logger.trace("Pokemons JSON Page IOException exception: " + e);
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
