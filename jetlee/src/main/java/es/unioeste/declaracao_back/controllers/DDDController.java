package es.unioeste.declaracao_back.controllers;

import es.unioeste.declaracao_back.models.Entities.DDD;
import es.unioeste.declaracao_back.repositories.ContribuinteRepository;
import es.unioeste.declaracao_back.repositories.DDDRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("ddd")
public class DDDController {

    private DDDRepository dddRepository;

    @Autowired
    public void setDddRepository(DDDRepository dddRepository) {
        this.dddRepository = dddRepository;
    }

    @PostMapping
    public ResponseEntity<DDD> create(@RequestBody DDD dddform){
        DDD ddd = dddRepository.save(dddform);
        return ResponseEntity.ok(ddd);
    }

    @GetMapping
    public ResponseEntity<List<DDD>> list(){
        List<DDD> ddds = dddRepository.findAll();
        return ResponseEntity.ok(ddds);
    }

    @DeleteMapping
    public ResponseEntity<Void>delete(){
        dddRepository.deleteAll();
        return ResponseEntity.ok().build();
    }
}
