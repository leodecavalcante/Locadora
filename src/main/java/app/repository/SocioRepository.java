package app.repository;

import app.entities.Socio;
import org.springframework.data.repository.CrudRepository;

public interface SocioRepository extends CrudRepository<Socio, Integer> {
}
