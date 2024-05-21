package es.unioeste.declaracao_back.repositories;

import es.unioeste.declaracao_back.models.Entities.Dependente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DependenteRepository extends JpaRepository<Dependente, Long> {
}
