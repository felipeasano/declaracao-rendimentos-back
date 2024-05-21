package es.unioeste.declaracao_back.models.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Contribuinte extends PessoaFisica{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @OneToMany()
    private List<Dependente> dependentes;

    @OneToMany()
    private List<BemDireito> bensDireitos;
}
