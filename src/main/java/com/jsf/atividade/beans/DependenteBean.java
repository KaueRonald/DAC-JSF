package com.jsf.atividade.beans;

import com.jsf.atividade.models.Dependente;
import com.jsf.atividade.repositories.DependentesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.time.LocalDate;
import java.util.Arrays;

@RequestScoped
@ManagedBean
@Component
public class DependenteBean {

    private String uuid;
    private String nome;

    private LocalDate dataDeNascimento;


    @Autowired
    private DependentesRepository repository;

    public void listDependente(){
        Dependente d1 = new Dependente();
        Dependente d2 = new Dependente();
        Dependente d3 = new Dependente();

        d1.setNome("kaue");
        d2.setNome("ronald");
        d3.setNome("silva");

        repository.saveAll(Arrays.asList(d1,d2,d3));
    }

    public void save() {
        if (this.uuid != null && this.nome != null && this.dataDeNascimento != null) {
            if (this.uuid != "" && this.nome != "") {
                Dependente dependente = new Dependente();
                dependente.setUuid(uuid);
                dependente.setNome(nome);
                repository.save(dependente);
                this.uuid = "";
                this.nome = "";
            }
        }
    }

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