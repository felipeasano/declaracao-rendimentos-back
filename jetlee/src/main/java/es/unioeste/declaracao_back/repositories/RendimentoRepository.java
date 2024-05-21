package es.unioeste.declaracao_back.repositories;

import es.unioeste.declaracao_back.models.Entities.Rendimento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RendimentoRepository extends JpaRepository<Rendimento, Long> {

    public Optional<Rendimento> findByCpf(String cpf);
}
