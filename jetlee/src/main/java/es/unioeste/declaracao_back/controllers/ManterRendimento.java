package es.unioeste.declaracao_back.controllers;

import es.unioeste.declaracao_back.models.Entities.Contribuinte;
import es.unioeste.declaracao_back.models.Entities.Rendimento;
import es.unioeste.declaracao_back.models.Entities.Tributavel;
import es.unioeste.declaracao_back.repositories.BemDireitoRepository;
import es.unioeste.declaracao_back.repositories.ContribuinteRepository;
import es.unioeste.declaracao_back.repositories.RendimentoRepository;
import es.unioeste.declaracao_back.repositories.TributavelRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@CrossOrigin
@RequestMapping("rendimento")
public class ManterRendimento {

    public RendimentoRepository rendimentoRepository;
    public TributavelRepository tributavelRepository;


    public ContribuinteRepository contribuinteRepository;

    @Autowired
    public void setRendimentoRepository(RendimentoRepository rendimentoRepository) {
        this.rendimentoRepository = rendimentoRepository;
    }

    @Autowired
    public void setTributavelRepository(TributavelRepository tributavelRepository) {
        this.tributavelRepository = tributavelRepository;
    }

    @Autowired
    public void setContribuinteRepository(ContribuinteRepository contribuinteRepository) {
        this.contribuinteRepository = contribuinteRepository;
    }

    @PostMapping
    public ResponseEntity<Rendimento> create(@RequestBody Rendimento rendimentoForm) {

        Optional<Contribuinte> contribuinteOptional = contribuinteRepository.findByCpf(rendimentoForm.getCpf());
        if(!contribuinteOptional.isPresent()){
            return ResponseEntity.notFound().build();
        }

        // Obter a lista de tributáveis do rendimento
        List<Tributavel> tributaveis = rendimentoForm.getTributaveis();

        // Iterar sobre cada tributável
        for (Tributavel tributavel : tributaveis) {

            tributavelRepository.save(tributavel);
        }
        // Salvar o rendimento junto com os tributáveis associados
        Rendimento rendimento = rendimentoRepository.save(rendimentoForm);

        return ResponseEntity.ok(rendimento);
    }

    @GetMapping
    public ResponseEntity<List<Rendimento>>list(){
        List<Rendimento> rendimentos = rendimentoRepository.findAll();
        return ResponseEntity.ok(rendimentos);
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<?> get(@PathVariable String cpf){
        Optional<Rendimento> rendimentoOptional = rendimentoRepository.findByCpf(cpf);

        if(rendimentoOptional.isPresent()){
            return ResponseEntity.ok(rendimentoOptional.get());
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping
    public ResponseEntity<Void>delete(){
        rendimentoRepository.deleteAll();
        return ResponseEntity.ok().build();
    }
}
