package app.controllers;

import app.entities.Filme;
import app.entities.Reserva;
import app.entities.Socio;
import app.entities.TO.ResponseTO;
import app.enums.FilmeEnum;
import app.repository.ReservaRepository;
import app.services.FilmeService;
import app.services.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reserva")
public class ReservaController {

    @Autowired
    FilmeService filmeService;

    @Autowired
    ReservaService reservaService;

    @RequestMapping(value = "/reservar", method = RequestMethod.PUT)
    private ResponseTO reservarFilme(Filme filme, Socio socio){
        ResponseTO responseTO;
        if (FilmeEnum.DISPONIVEL.equals(filmeService.isDisponivel(filme))){
            Reserva reserva = new Reserva(filme, socio);
            responseTO = reservaService.reservarFilme(reserva);
        } else {
            responseTO = new ResponseTO(HttpStatus.CONFLICT,FilmeEnum.INDISPONIVEL.toString());
        }
        return responseTO;
    }

    @RequestMapping(value = "/remover", method = RequestMethod.PUT)
    private ResponseTO removerReserva(Filme filme, Socio socio){
        Reserva reserva = new Reserva(filme, socio);
        ResponseTO responseTO = reservaService.reservarFilme(reserva);
        return responseTO;
    }

}
