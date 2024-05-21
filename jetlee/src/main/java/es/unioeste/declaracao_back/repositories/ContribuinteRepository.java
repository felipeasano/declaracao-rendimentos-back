package es.unioeste.declaracao_back.repositories;

import es.unioeste.declaracao_back.models.Entities.Contribuinte;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContribuinteRepository extends JpaRepository<Contribuinte, Long> {

    // Método para encontrar um contribuinte pelo nome
    Contribuinte findByNome(String nome);

    // Método para encontrar um contribuinte pelo CPF
    Optional<Contribuinte> findByCpf(String cpf);

    // Método para encontrar um contribuinte pelo nome e CPF
    Contribuinte findByNomeAndCpf(String nome, String cpf);
}
