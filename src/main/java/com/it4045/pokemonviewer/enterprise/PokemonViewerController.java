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
import java.util.logging.Logger;

@Controller
public class PokemonViewerController {

    @Autowired
    IPokemonService pokemonService;

   // Logger log = (Logger) LoggerFactory.getLogger(this.getClass());

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

    @DeleteMapping("/pokemons")
    public ResponseEntity deletePokemon(@PathVariable("id") int id)    {
        try {
            pokemonService.delete(id);
            return new ResponseEntity(HttpStatus.OK);
        }   catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
