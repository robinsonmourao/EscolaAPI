package com.a4s.EscolaAPI.estudante;

import java.time.LocalDate;

public class Estudante {
    private Long id;
    private String nome;
    private String email;
    private LocalDate dod;
    private Integer idade;

    public Estudante(Long id, String nome, String email, LocalDate dod, Integer idade) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dod = dod;
        this.idade = idade;
    }    

    public Estudante(String nome, String email, LocalDate dod, Integer idade) {
        this.nome = nome;
        this.email = email;
        this.dod = dod;
        this.idade = idade;
    }

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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDate getDod() {
        return dod;
    }
    public void setDod(LocalDate dod) {
        this.dod = dod;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Estudante [id=" + id + ", nome=" + nome + ", email=" + email + ", dod=" + dod + ", idade=" + idade
                + "]";
    }
    
}