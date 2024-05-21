package es.unioeste.declaracao_back.controllers;

import es.unioeste.declaracao_back.models.Entities.EnderecoEspecifico;
import es.unioeste.declaracao_back.repositories.DDDRepository;
import es.unioeste.declaracao_back.repositories.EnderecoEspecificoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("enderecoespecifico")
public class EnderecoEspecificoController {

    public EnderecoEspecificoRepository enderecoEspecificoRepository;

    @Autowired
    public void setEnderecoEspecificoRepository(EnderecoEspecificoRepository enderecoEspecificoRepository) {
        this.enderecoEspecificoRepository = enderecoEspecificoRepository;
    }

    @PostMapping
    public ResponseEntity<EnderecoEspecifico>create(@RequestBody EnderecoEspecifico enderecoEspecificoform){
        EnderecoEspecifico enderecoEspecifico = enderecoEspecificoRepository.save(enderecoEspecificoform);
        return ResponseEntity.ok(enderecoEspecifico);
    }

    @GetMapping
    public ResponseEntity<List<EnderecoEspecifico>>list(){
        List<EnderecoEspecifico> enderecoEspecificos = enderecoEspecificoRepository.findAll();
        return ResponseEntity.ok(enderecoEspecificos);
    }

    @DeleteMapping
    public ResponseEntity<Void>delete(){
        enderecoEspecificoRepository.deleteAll();
        return ResponseEntity.ok().build();
    }
}
