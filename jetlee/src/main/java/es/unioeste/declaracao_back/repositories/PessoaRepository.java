package es.unioeste.declaracao_back.repositories;

import es.unioeste.declaracao_back.models.Entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
