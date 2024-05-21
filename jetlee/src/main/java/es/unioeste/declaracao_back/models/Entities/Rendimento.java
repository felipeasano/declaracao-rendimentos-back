package es.unioeste.declaracao_back.models.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Rendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contribuinte;
    private String cpf;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "rendimento_id")
    List<Tributavel> tributaveis;
}


