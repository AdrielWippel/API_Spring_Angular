package br.com.projetoa.apia.controller;

import br.com.projetoa.apia.modelo.Endereco;
import br.com.projetoa.apia.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/endereco")
public class EnderecoController {
    @Autowired
    private EnderecoRepository enderecoRepository;

    @GetMapping("/getAll")
    public List<Endereco> getAllEnderecos() {
        return enderecoRepository.findAll();
    }
}


// opcional????