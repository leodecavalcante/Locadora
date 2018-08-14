package app.repository;

import app.entities.Filme;
import app.entities.Reserva;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReservaRepository extends CrudRepository<Reserva, Integer> {

    List<Reserva> findByFilme(Filme filme);
}
