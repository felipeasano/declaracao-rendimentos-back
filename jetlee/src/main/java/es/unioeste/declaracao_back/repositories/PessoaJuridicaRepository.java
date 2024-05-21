package es.unioeste.declaracao_back.repositories;

import es.unioeste.declaracao_back.models.Entities.PessoaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridica, Long> {
}
