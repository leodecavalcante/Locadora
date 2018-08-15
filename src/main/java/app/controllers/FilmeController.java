package app.controllers;

import app.entities.Filme;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filme")
public class FilmeController {

    @RequestMapping(value = "/alugar", method = RequestMethod.POST)
    private void inserirFilme(Filme filme){

    }

    @RequestMapping(value = "/buscar", method = RequestMethod.GET)
    private void buscarFilme(String nome){

    }

}
