package es.unioeste.declaracao_back.controllers;

import es.unioeste.declaracao_back.models.Entities.TipoBemDireito;
import es.unioeste.declaracao_back.repositories.DDDRepository;
import es.unioeste.declaracao_back.repositories.TipoBemDireitoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("tipobemdireito")
public class TipoBemDireitoController {

    private TipoBemDireitoRepository tipoBemDireitoRepository;

    @Autowired
    public void setTipoBemDireitoRepository(TipoBemDireitoRepository tipoBemDireitoRepository) {
        this.tipoBemDireitoRepository = tipoBemDireitoRepository;
    }

    @PostMapping
    public ResponseEntity<TipoBemDireito> create(@RequestBody TipoBemDireito tipoBemDireitoform){
        TipoBemDireito tipoBemDireito = tipoBemDireitoRepository.save(tipoBemDireitoform);
        return ResponseEntity.ok(tipoBemDireito);
    }

    @GetMapping
    public ResponseEntity<List<TipoBemDireito>> list(){
        List<TipoBemDireito> tipos = tipoBemDireitoRepository.findAll();
        return ResponseEntity.ok(tipos);
    }

    @DeleteMapping
    public ResponseEntity<Void>delete(){
        tipoBemDireitoRepository.deleteAll();
        return ResponseEntity.ok().build();
    }
}
