package app.services;

import app.entities.Locacao;
import app.entities.TO.ResponseTO;
import app.enums.LocacaoEnum;
import app.repository.LocacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class LocacaoService {

    @Autowired
    LocacaoRepository locacaoRepository;

    public ResponseTO alugarFilme(Locacao locacao){
        ResponseTO responseTO = new ResponseTO();
        try{
            synchronized (this) {
                locacaoRepository.save(locacao);
            }
            responseTO = new ResponseTO(HttpStatus.CREATED, LocacaoEnum.ALUGADO.toString());
        } catch(Exception e){
            responseTO = new ResponseTO(HttpStatus.CONFLICT);
        } finally {
            return responseTO;
        }
    }

    public ResponseTO devolverFilme(Locacao locacao){
        ResponseTO responseTO = new ResponseTO();
        try{
            locacaoRepository.delete(locacao);
            responseTO = new ResponseTO(HttpStatus.CREATED, LocacaoEnum.DEVOLVIDO.toString());
        } catch(Exception e){
            responseTO = new ResponseTO(HttpStatus.CONFLICT);
        } finally {
            return responseTO;
        }
    }
}
