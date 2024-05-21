package es.unioeste.declaracao_back.controllers;

import es.unioeste.declaracao_back.models.Entities.Fone;
import es.unioeste.declaracao_back.repositories.DDDRepository;
import es.unioeste.declaracao_back.repositories.FoneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("fone")
public class FoneController {

    public FoneRepository foneRepository;

    @Autowired
    public void setFoneRepository(FoneRepository foneRepository) {
        this.foneRepository = foneRepository;
    }

    @PostMapping
    public ResponseEntity<Fone>create(@RequestBody Fone foneform){
        Fone fone = foneRepository.save(foneform);
        return ResponseEntity.ok(fone);
    }

    @GetMapping
    public ResponseEntity<List<Fone>>list(){
        List<Fone> fones = foneRepository.findAll();
        return ResponseEntity.ok(fones);
    }

    @DeleteMapping
    public ResponseEntity<Void>delete(){
        foneRepository.deleteAll();
        return ResponseEntity.ok().build();
    }
}
