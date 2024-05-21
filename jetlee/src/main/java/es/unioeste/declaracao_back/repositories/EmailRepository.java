package es.unioeste.declaracao_back.repositories;

import es.unioeste.declaracao_back.models.Entities.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, Long> {
}
