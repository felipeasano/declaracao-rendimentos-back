package es.unioeste.declaracao_back.models.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class PessoaJuridica extends Pessoa{

    private String cnpj;
}
