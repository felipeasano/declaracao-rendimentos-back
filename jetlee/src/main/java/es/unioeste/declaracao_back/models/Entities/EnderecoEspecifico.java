package es.unioeste.declaracao_back.models.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class EnderecoEspecifico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int nro;

    private String complemento;

    @ManyToOne
    @JoinColumn(name = "fk_endereco")
    private com.example.enderecoback.models.entities.Endereco endereco;
}
