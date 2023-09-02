package br.com.projetoa.apia.controller;

import br.com.projetoa.apia.modelo.Comunidade;
import br.com.projetoa.apia.repository.ComunidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/comunidade")
public class ComunidadeController {
    @Autowired
    private ComunidadeRepository comunidadeRepository;

    @GetMapping("/getAll")
    public List<Comunidade> getAllComunidades() {
        return comunidadeRepository.findAll();
    }

    @PostMapping("/save")
    public Comunidade saveComunidade(@RequestBody Comunidade comunidade) {
        return comunidadeRepository.save(comunidade);
    }
}
