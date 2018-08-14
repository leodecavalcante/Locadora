package app.repository;

import app.entities.Filme;
import app.entities.Locacao;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LocacaoRepository extends CrudRepository<Locacao, Integer> {

    List<Locacao> findByFilme(Filme filme);
}
