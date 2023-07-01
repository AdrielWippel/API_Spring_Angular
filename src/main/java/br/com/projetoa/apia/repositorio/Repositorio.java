package br.com.projetoa.apia.repositorio;

import org.springframework.data.repository.CrudRepository;

import br.com.projetoa.apia.modelo.Cliente;

public interface Repositorio extends CrudRepository<Cliente, Long> {
    
}
