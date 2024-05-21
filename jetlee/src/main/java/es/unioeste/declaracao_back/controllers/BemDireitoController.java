package es.unioeste.declaracao_back.controllers;

import es.unioeste.declaracao_back.models.Entities.BemDireito;
import es.unioeste.declaracao_back.repositories.BemDireitoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("bemdireito")
public class BemDireitoController {

    public BemDireitoRepository bemDireitoRepository;

    @Autowired
    public void setBemDireitoRepository(BemDireitoRepository bemDireitoRepository) {
        this.bemDireitoRepository = bemDireitoRepository;
    }

    @PostMapping
    public ResponseEntity<BemDireito> create(@RequestBody BemDireito bemDireitoform){
        BemDireito bemDireito = bemDireitoRepository.save(bemDireitoform);
        return ResponseEntity.ok(bemDireito);
    }

    @GetMapping
    public ResponseEntity<List<BemDireito>>list(){
        List<BemDireito> bensdireitos = bemDireitoRepository.findAll();
        return ResponseEntity.ok(bensdireitos);
    }

    @DeleteMapping
    public ResponseEntity<Void>delete(){
        bemDireitoRepository.deleteAll();
        return ResponseEntity.ok().build();
    }
}
