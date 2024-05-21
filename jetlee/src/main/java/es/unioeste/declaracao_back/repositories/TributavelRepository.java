package es.unioeste.declaracao_back.repositories;

import es.unioeste.declaracao_back.models.Entities.Tributavel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TributavelRepository extends JpaRepository<Tributavel, Long> {
}
