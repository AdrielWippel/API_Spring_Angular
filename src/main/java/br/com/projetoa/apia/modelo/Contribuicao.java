package br.com.projetoa.apia.modelo;

import jakarta.persistence.*;

@Entity
public class Contribuicao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Dizimista dizimista;

    private Double valor;
    private String data;

    // Construtores
    public Contribuicao() {
        // Construtor vazio
    }

    public Contribuicao(Dizimista dizimista, Double valor, String data) {
        this.dizimista = dizimista;
        this.valor = valor;
        this.data = data;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Dizimista getDizimista() {
        return dizimista;
    }

    public void setDizimista(Dizimista dizimista) {
        this.dizimista = dizimista;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    // Outros getters e setters para os demais atributos
}
