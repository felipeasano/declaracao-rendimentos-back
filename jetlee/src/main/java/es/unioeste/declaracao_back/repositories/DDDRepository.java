package es.unioeste.declaracao_back.repositories;

import es.unioeste.declaracao_back.models.Entities.DDD;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DDDRepository extends JpaRepository<DDD, Long> {
}
