package app.services;

import app.entities.Filme;
import app.entities.Locacao;
import app.entities.Reserva;
import app.enums.FilmeEnum;
import app.repository.LocacaoRepository;
import app.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {

    @Autowired
    LocacaoRepository locacaoRepository;

    @Autowired
    ReservaRepository reservaRepository;

    public FilmeEnum isDisponivel(Filme filme){
        List<Locacao> locacoes = locacaoRepository.findByFilme(filme);
        List<Reserva> reservas = reservaRepository.findByFilme(filme);
        if ((locacoes.size() + reservas.size())  == filme.getQuantidade()){
            return FilmeEnum.INDISPONIVEL;
        } else {
            return FilmeEnum.DISPONIVEL;
        }
    }
}
