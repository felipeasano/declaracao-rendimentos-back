package es.unioeste.declaracao_back.repositories;

import es.unioeste.declaracao_back.models.Entities.TipoBemDireito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoBemDireitoRepository extends JpaRepository<TipoBemDireito, Long> {
}
