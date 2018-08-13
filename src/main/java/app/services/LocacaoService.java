package app.services;

import app.entities.Filme;
import app.entities.TO.LocacaoResponseTO;
import org.springframework.stereotype.Service;

@Service
public class LocacaoService {

    public LocacaoResponseTO alugarFilme(Filme filme){
        //TODO CONCORRENCIA
        return new LocacaoResponseTO();
    }
}
