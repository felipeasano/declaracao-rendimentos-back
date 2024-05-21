package es.unioeste.declaracao_back.controllers;

import es.unioeste.declaracao_back.models.Entities.Contribuinte;
import es.unioeste.declaracao_back.repositories.BemDireitoRepository;
import es.unioeste.declaracao_back.repositories.ContribuinteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("contribuinte")
public class ContribuinteController {

    public ContribuinteRepository contribuinteRepository;

    @Autowired
    public void setContribuinteRepository(ContribuinteRepository contribuinteRepository) {
        this.contribuinteRepository = contribuinteRepository;
    }

    @PostMapping
    public ResponseEntity<Contribuinte>create(@RequestBody Contribuinte contribuinteform){
        Contribuinte contribuinte = contribuinteRepository.save((contribuinteform));
        return ResponseEntity.ok(contribuinte);
    }

    @GetMapping
    public ResponseEntity<List<Contribuinte>>list(){
        List<Contribuinte> contribuintes = contribuinteRepository.findAll();
        return ResponseEntity.ok(contribuintes);
    }

    @DeleteMapping
    public ResponseEntity<Void>delete(){
        contribuinteRepository.deleteAll();
        return ResponseEntity.ok().build();
    }
}
