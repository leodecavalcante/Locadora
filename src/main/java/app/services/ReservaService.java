package app.services;

import app.entities.Reserva;
import app.entities.TO.ResponseTO;
import app.enums.FilmeEnum;
import app.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;


@Service
public class ReservaService {

    @Autowired
    ReservaRepository reservaRepository;

    public ResponseTO reservarFilme(Reserva reserva){
        ResponseTO responseTO = new ResponseTO();
        try{
            synchronized (this) {
                reservaRepository.save(reserva);
            }
            responseTO = new ResponseTO(HttpStatus.CREATED, FilmeEnum.RESERVADO.toString());
        } catch(Exception e){
            responseTO = new ResponseTO(HttpStatus.CONFLICT);
        } finally {
            return responseTO;
        }
    }

    public ResponseTO removerReserva(Reserva reserva){

        ResponseTO responseTO = new ResponseTO();
        try{
            reservaRepository.delete(reserva);

            responseTO = new ResponseTO(HttpStatus.CREATED, FilmeEnum.DISPONIVEL.toString());
        } catch(Exception e){
        responseTO = new ResponseTO(HttpStatus.CONFLICT);
    } finally {
        return responseTO;
    }
    }

}
