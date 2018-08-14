package app.services;

import app.entities.Filme;
import app.entities.Locacao;
import app.entities.Socio;
import app.entities.TO.ResponseTO;
import app.repository.LocacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class LocacaoService {

    @Autowired
    LocacaoRepository locacaoRepository;

    public ResponseTO alugarFilme(Filme filme, Socio socio){
        Locacao locacao = new Locacao(filme, socio);
        synchronized (this) {
            locacaoRepository.save(locacao);
        }
        return new ResponseTO(HttpStatus.CREATED);
    }
}
