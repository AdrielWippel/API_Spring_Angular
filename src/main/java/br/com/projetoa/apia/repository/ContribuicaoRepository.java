package br.com.projetoa.apia.repository;

import br.com.projetoa.apia.modelo.Contribuicao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContribuicaoRepository extends JpaRepository<Contribuicao, Long> {
}
