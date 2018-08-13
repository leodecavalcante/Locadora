package app.repository;

import app.entities.Locacao;
import org.springframework.data.repository.CrudRepository;

public interface LocacaoRepository extends CrudRepository<Locacao, Integer> {
}
