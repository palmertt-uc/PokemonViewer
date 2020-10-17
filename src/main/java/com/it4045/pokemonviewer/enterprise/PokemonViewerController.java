package com.it4045.pokemonviewer.enterprise;

import com.it4045.pokemonviewer.enterprise.service.IPokemonService;
import com.it4045.pokemonviewer.enterprise.dto.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
public class PokemonViewerController {

    @Autowired
    IPokemonService pokemonService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/pokemons")
    public ResponseEntity getPokemon() {
        System.out.println("TESTESTS");
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
