package es.unioeste.declaracao_back.models.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Fone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int nro;

    @ManyToOne
    @JoinColumn(name = "fk_ddd")
    private DDD ddd;
}
