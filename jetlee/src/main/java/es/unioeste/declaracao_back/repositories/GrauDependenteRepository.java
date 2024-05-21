package es.unioeste.declaracao_back.repositories;

import es.unioeste.declaracao_back.models.Entities.GrauDependente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrauDependenteRepository extends JpaRepository<GrauDependente, Long> {
}
