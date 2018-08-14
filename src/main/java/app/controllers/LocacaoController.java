package app.controllers;

import app.entities.Filme;
import app.entities.Socio;
import app.entities.TO.ResponseTO;
import app.enums.FilmeEnum;
import app.services.FilmeService;
import app.services.LocacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocacaoController {

    @Autowired
    FilmeService filmeService;

    @Autowired
    LocacaoService locacaoService;

    private ResponseTO alugarFilme(Filme filme, Socio socio){
        ResponseTO responseTO;
        if (FilmeEnum.DISPONIVEL.equals(filmeService.isDisponivel(filme))){
            responseTO = locacaoService.alugarFilme(filme, socio);
        } else {
            responseTO = new ResponseTO(HttpStatus.CONFLICT);
        }
        return responseTO;
    }

    private void devolverFilme(Filme filme) {

    }
}
