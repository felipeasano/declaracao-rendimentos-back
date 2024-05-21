package es.unioeste.declaracao_back.repositories;

import es.unioeste.declaracao_back.models.Entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
