package app.controllers;

import app.entities.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @RequestMapping(value = "/inserir", method = RequestMethod.POST)
    private void inserirCategoria(Categoria categoria){

    }

}
