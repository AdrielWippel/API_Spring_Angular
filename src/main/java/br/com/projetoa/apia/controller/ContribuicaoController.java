package br.com.projetoa.apia.controller;

import br.com.projetoa.apia.modelo.Contribuicao;
import br.com.projetoa.apia.repository.ContribuicaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contribuicao")
public class ContribuicaoController {
    @Autowired
    private ContribuicaoRepository contribuicaoRepository;

    @GetMapping("/getAll")
    public List<Contribuicao> getAllContribuicoes() {
        return contribuicaoRepository.findAll();
    }
}
