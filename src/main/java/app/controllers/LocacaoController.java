package app.controllers;

import app.entities.Filme;
import app.entities.Locacao;
import app.entities.Socio;
import app.entities.TO.ResponseTO;
import app.enums.FilmeEnum;
import app.services.FilmeService;
import app.services.LocacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/locacao")
public class LocacaoController {

    @Autowired
    FilmeService filmeService;

    @Autowired
    LocacaoService locacaoService;

    @RequestMapping(value = "/alugar", method = RequestMethod.PUT)
    private ResponseTO alugarFilme(Filme filme, Socio socio){
        ResponseTO responseTO = new ResponseTO();
        if (FilmeEnum.DISPONIVEL.equals(filmeService.isDisponivel(filme))){
            Locacao locacao = new Locacao(filme, socio);
            responseTO = locacaoService.alugarFilme(locacao);
        } else {
            responseTO.setHttpStatus(HttpStatus.CONFLICT);
        }
        return responseTO;
    }

    @RequestMapping(value = "/devolver", method = RequestMethod.DELETE)
    private ResponseTO devolverFilme(Filme filme, Socio socio) {
        Locacao locacao = new Locacao(filme, socio);
        ResponseTO responseTO = locacaoService.devolverFilme(locacao);
        return responseTO;
    }
}
