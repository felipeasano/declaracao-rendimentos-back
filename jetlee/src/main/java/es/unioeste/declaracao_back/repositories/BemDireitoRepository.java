package es.unioeste.declaracao_back.repositories;

import es.unioeste.declaracao_back.models.Entities.BemDireito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BemDireitoRepository extends JpaRepository<BemDireito, Long> {
}
