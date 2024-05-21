package es.unioeste.declaracao_back.models.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Dependente extends PessoaFisica{

    @ManyToOne
    @JoinColumn(name = "fk_grauDependente")
    private GrauDependente grauDependente;
}
