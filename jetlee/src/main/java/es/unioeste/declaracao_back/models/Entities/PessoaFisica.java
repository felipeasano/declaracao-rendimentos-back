package es.unioeste.declaracao_back.models.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
public class PessoaFisica extends Pessoa{

    private String nome;
    private String sobrenome;
    private String cpf;
    private LocalDate dataNascimento;
}
