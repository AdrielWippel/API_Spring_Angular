package br.com.projetoa.apia.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoa.apia.modelo.Cliente;
import br.com.projetoa.apia.repositorio.Repositorio;

@RestController
public class Controle {

    @Autowired
    private Repositorio acao;

    @PostMapping("/")
    public Cliente cadastrar(@RequestBody Cliente c) {
        return acao.save(c);
    }

    @GetMapping("/")
    public Iterable<Cliente> selecionar() {
        return acao.findAll();
    }
    
}