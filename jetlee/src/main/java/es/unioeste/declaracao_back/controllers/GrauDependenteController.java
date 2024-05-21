package es.unioeste.declaracao_back.controllers;

import es.unioeste.declaracao_back.models.Entities.GrauDependente;
import es.unioeste.declaracao_back.repositories.DDDRepository;
import es.unioeste.declaracao_back.repositories.GrauDependenteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("graudependente")
public class GrauDependenteController {

    private GrauDependenteRepository grauDependenteRepository;

    @Autowired
    public void setGrauDependenteRepository(GrauDependenteRepository grauDependenteRepository) {
        this.grauDependenteRepository = grauDependenteRepository;
    }

    @PostMapping
    public ResponseEntity<GrauDependente> create(@RequestBody GrauDependente grauDependenteform){
        GrauDependente grauDependente = grauDependenteRepository.save(grauDependenteform);
        return ResponseEntity.ok(grauDependente);
    }

    @GetMapping
    public ResponseEntity<List<GrauDependente>> list(){
        List<GrauDependente> listaGrau = grauDependenteRepository.findAll();
        return ResponseEntity.ok(listaGrau);
    }

    @DeleteMapping
    public ResponseEntity<Void>delete(){
        grauDependenteRepository.deleteAll();
        return ResponseEntity.ok().build();
    }
}
