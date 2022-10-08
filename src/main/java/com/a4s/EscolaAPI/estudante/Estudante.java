package com.a4s.EscolaAPI.estudante;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.*;

@Entity //para hibernate
@Table //table do database
public class Estudante {

    @Id
    @SequenceGenerator(
        name = "estudante_sequence",
        sequenceName = "estudante_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "estudante_sequence"
    )
    private Long id;
    private String nome;
    private String email;
    private LocalDate dataDeNascimento;
    @Transient //Idade vai ser calculada ao inves de armazenada no Database
    private Integer idade;

    public Estudante() {

    }
    public Estudante(Long id, String nome, String email, LocalDate dataDeNascimento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
    }    

    public Estudante(String nome, String email, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
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
    public LocalDate getDataDeNascimento() { return dataDeNascimento;
    }
    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    public Integer getIdade() {
        return Period.between(this.dataDeNascimento, LocalDate.now()).getYears();
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Estudante [id=" + id + ", nome=" + nome + ", email=" + email + ", dataDeNascimento=" + dataDeNascimento + ", idade=" + idade
                + "]";
    }
    
}
