package app.controllers;

import app.entities.Socio;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/socio")
public class SocioController {

    @RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
    private void cadastrarSocio(Socio socio){

    }

}
