package es.unioeste.declaracao_back.models.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeSocial;

    @OneToMany()
    private List<Fone> fones;

    @OneToMany()
    private List<Email> emails;

    @OneToMany()
    private List<EnderecoEspecifico> enderecoEspecificos;
}
