package es.unioeste.declaracao_back.controllers;

import es.unioeste.declaracao_back.models.Entities.Dependente;
import es.unioeste.declaracao_back.models.Entities.GrauDependente;
import es.unioeste.declaracao_back.repositories.DDDRepository;
import es.unioeste.declaracao_back.repositories.DependenteRepository;
import es.unioeste.declaracao_back.repositories.GrauDependenteRepository;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("dependente")
public class DependenteController {

    public DependenteRepository dependenteRepository;

    @Autowired
    public void setDependenteRepository(DependenteRepository dependenteRepository) {
        this.dependenteRepository = dependenteRepository;
    }

    @PostMapping
    public ResponseEntity<Dependente>create(@RequestBody Dependente dependenteform){
        Dependente dependente = dependenteRepository.save((dependenteform));
        return ResponseEntity.ok(dependente);
    }

    @GetMapping
    public ResponseEntity<List<Dependente>>list(){
        List<Dependente> dependentes = dependenteRepository.findAll();
        return ResponseEntity.ok(dependentes);
    }

    @DeleteMapping
    public ResponseEntity<Void>delete(){
        dependenteRepository.deleteAll();
        return ResponseEntity.ok().build();
    }
}
