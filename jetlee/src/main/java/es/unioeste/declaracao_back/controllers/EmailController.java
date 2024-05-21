package es.unioeste.declaracao_back.controllers;

import es.unioeste.declaracao_back.models.Entities.Email;
import es.unioeste.declaracao_back.repositories.DDDRepository;
import es.unioeste.declaracao_back.repositories.EmailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("email")
public class EmailController {

    private EmailRepository emailRepository;

    @Autowired
    public void setEmailRepository(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }

    @PostMapping
    public ResponseEntity<Email>create(@RequestBody Email emailform){
        Email email = emailRepository.save(emailform);
        return ResponseEntity.ok(email);
    }

    @GetMapping
    public ResponseEntity<List<Email>> list(){
        List<Email> emails = emailRepository.findAll();
        return ResponseEntity.ok(emails);
    }

    @DeleteMapping
    public ResponseEntity<Void>delete(){
        emailRepository.deleteAll();
        return ResponseEntity.ok().build();
    }
}
