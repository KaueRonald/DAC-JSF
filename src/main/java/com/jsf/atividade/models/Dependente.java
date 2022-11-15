package com.jsf.atividade.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_dependente")
public class Dependente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String uuid;
    private String nome;
    private LocalDate dataDeNascimento;

    //Constructors
    public Dependente(){}

    public Dependente(String uuid, String nome, LocalDate dataDeNascimento) {
        this.uuid = uuid;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    //Getters and Setters

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
