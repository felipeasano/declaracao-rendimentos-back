package es.unioeste.declaracao_back.repositories;

import es.unioeste.declaracao_back.models.Entities.Fone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoneRepository extends JpaRepository<Fone, Long> {
}
