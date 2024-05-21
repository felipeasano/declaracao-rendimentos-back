package es.unioeste.declaracao_back.repositories;

import es.unioeste.declaracao_back.models.Entities.PessoaFisica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Long> {
}
