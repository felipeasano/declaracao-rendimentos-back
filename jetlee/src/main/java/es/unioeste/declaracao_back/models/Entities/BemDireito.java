package es.unioeste.declaracao_back.models.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class BemDireito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private float valor;
    private String descricao;
    private LocalDate dataAquisicao;

    @ManyToOne
    @JoinColumn(name = "fk_tipoBemDireito")
    private TipoBemDireito tipoBemDireito;
}
