package com.it4045.pokemonviewer.enterprise;

import org.springframework.web.bind.annotation.RequestMapping;

public class PokemonViewerController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
