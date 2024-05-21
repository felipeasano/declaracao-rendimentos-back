package es.unioeste.declaracao_back.controllers;

import es.unioeste.declaracao_back.models.Entities.Empresa;
import es.unioeste.declaracao_back.repositories.DDDRepository;
import es.unioeste.declaracao_back.repositories.EmpresaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("empresa")
public class EmpresaController {

    public EmpresaRepository empresaRepository;

    @Autowired
    public void setEmpresaRepository(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    @PostMapping
    public ResponseEntity<Empresa>create(@RequestBody Empresa empresaform){
        Empresa empresa = empresaRepository.save(empresaform);
        return ResponseEntity.ok(empresa);
    }

    @GetMapping
    public ResponseEntity<List<Empresa>>list(){
        List<Empresa> empresas = empresaRepository.findAll();
        return ResponseEntity.ok(empresas);
    }

    @DeleteMapping
    public ResponseEntity<Void>delete(){
        empresaRepository.deleteAll();
        return ResponseEntity.ok().build();
    }
}
