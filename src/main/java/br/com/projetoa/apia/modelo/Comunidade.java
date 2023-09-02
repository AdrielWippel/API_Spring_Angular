package br.com.projetoa.apia.modelo;

import jakarta.persistence.*;

@Entity
public class Comunidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    // Construtores
    public Comunidade() {
        // Construtor vazio
    }

    public Comunidade(String nome, Dizimista administrador) {
        this.nome = nome;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    

    // Outros getters e setters para os demais atributos
}
