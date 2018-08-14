package app.services;

import app.entities.Filme;
import app.entities.Reserva;
import app.entities.Socio;
import app.entities.TO.ResponseTO;
import app.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;


@Service
public class ReservaService {

    @Autowired
    ReservaRepository reservaRepository;

    public ResponseTO reservarFilme(Filme filme, Socio socio){
        Reserva locacao = new Reserva(filme, socio);
        synchronized (this) {
            reservaRepository.save(locacao);
        }
        return new ResponseTO(HttpStatus.CREATED);
    }

}
