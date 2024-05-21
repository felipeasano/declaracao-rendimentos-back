package es.unioeste.declaracao_back.models.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Tributavel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cnpj;
    private String nome;
    private String valorTotal;
    private String inss;
    private String irrf;
    private String valor13;
}
