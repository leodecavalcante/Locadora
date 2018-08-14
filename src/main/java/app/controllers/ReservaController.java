package app.controllers;

import app.entities.Filme;
import app.entities.Socio;
import app.entities.TO.ResponseTO;
import app.enums.FilmeEnum;
import app.repository.ReservaRepository;
import app.services.FilmeService;
import app.services.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

public class ReservaController {

    @Autowired
    FilmeService filmeService;

    @Autowired
    ReservaService reservaService;


    private ResponseTO reservarFilme(Filme filme, Socio socio){
        ResponseTO responseTO;
        if (FilmeEnum.DISPONIVEL.equals(filmeService.isDisponivel(filme))){
            responseTO = reservaService.reservarFilme(filme, socio);
        } else {
            responseTO = new ResponseTO(HttpStatus.CONFLICT);
        }
        return responseTO;
    }

}
