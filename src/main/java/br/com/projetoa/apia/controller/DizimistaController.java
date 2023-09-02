package br.com.projetoa.apia.controller;

import br.com.projetoa.apia.modelo.Dizimista;
import br.com.projetoa.apia.repository.DizimistaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 8600)
@RequestMapping("/dizimista")
public class DizimistaController {
    @Autowired
    private DizimistaRepository dizimistaRepository;

    private static final Logger logger = LoggerFactory.getLogger(DizimistaController.class);

    @GetMapping("/getAll")
    public List<Dizimista> getAllDizimistas() {
        logger.info("Chamada para getAllDizimistas realizada");
        return dizimistaRepository.findAll();
    }

    @PostMapping("/save")
    public Dizimista saveDizimista(@RequestBody Dizimista dizimista) {
        return dizimistaRepository.save(dizimista);
    }

    // Outros métodos e endpoints conforme necessário
}
