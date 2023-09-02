package br.com.projetoa.apia.modelo;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Dizimista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String nascimento;
    private String cpf;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    private String telefone;
    private String email;

    @ManyToOne
    private Dizimista conjugue;

    @OneToMany(mappedBy = "conjugue")
    private List<Dizimista> filhos = new ArrayList<>();

    @OneToMany(mappedBy = "dizimista")
    private List<Contribuicao> contribuicoes = new ArrayList<>();

    @ManyToOne
    private Comunidade comunidade;

    private boolean sacBatismo;
    private Date datBatismo;

    private boolean sacComunhao;
    private Date datComunhao;

    private boolean sacCasamento;
    private Date datCasamento;

    // Construtores
    public Dizimista() {
        // Construtor vazio
    }

    public Dizimista(String nome, String nascimento, String cpf, Endereco endereco, String telefone, String email) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
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

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Dizimista getConjugue() {
        return conjugue;
    }

    public void setConjugue(Dizimista conjugue) {
        this.conjugue = conjugue;
    }

    public List<Dizimista> getFilhos() {
        return filhos;
    }

    public void addFilho(Dizimista filho) {
        filhos.add(filho);
        filho.setConjugue(this); // Configura o conjugue do filho para este dizimista
    }

    public List<Contribuicao> getContribuicoes() {
        return contribuicoes;
    }

    public void addContribuicao(Contribuicao contribuicao) {
        contribuicoes.add(contribuicao);
        contribuicao.setDizimista(this); // Configura o dizimista da contribuição para este dizimista
    }

    public Comunidade getComunidade() {
        return comunidade;
    }

    public void setComunidade(Comunidade comunidade) {
        this.comunidade = comunidade;
    }

    public void setFilhos(List<Dizimista> filhos) {
        this.filhos = filhos;
    }

    public void setContribuicoes(List<Contribuicao> contribuicoes) {
        this.contribuicoes = contribuicoes;
    }

    public boolean isSacBatismo() {
        return sacBatismo;
    }

    public void setSacBatismo(boolean sacBatismo) {
        this.sacBatismo = sacBatismo;
    }

    public Date getDatBatismo() {
        return datBatismo;
    }

    public void setDatBatismo(Date datBatismo) {
        this.datBatismo = datBatismo;
    }

    public boolean isSacComunhao() {
        return sacComunhao;
    }

    public void setSacComunhao(boolean sacComunhao) {
        this.sacComunhao = sacComunhao;
    }

    public Date getDatComunhao() {
        return datComunhao;
    }

    public void setDatComunhao(Date datComunhao) {
        this.datComunhao = datComunhao;
    }

    public boolean isSacCasamento() {
        return sacCasamento;
    }

    public void setSacCasamento(boolean sacCasamento) {
        this.sacCasamento = sacCasamento;
    }

    public Date getDatCasamento() {
        return datCasamento;
    }

    public void setDatCasamento(Date datCasamento) {
        this.datCasamento = datCasamento;
    }
}
