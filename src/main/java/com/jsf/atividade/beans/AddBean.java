package com.jsf.atividade.beans;

import com.jsf.atividade.models.Dependente;
import com.jsf.atividade.models.Pessoa;
import com.jsf.atividade.repositories.PessoaRepository;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean
@Component
public class AddBean {
    private String nome;
    private String cpf;

    private Dependente dependente;

    @Autowired
    private PessoaRepository repository;

    public void save(){
        if(this.nome !=null && this.cpf != null){
            if(this.nome != "" && this.cpf != ""){
                Pessoa pessoa = new Pessoa();
                pessoa.setNome(nome);
                pessoa.setCpf(cpf);
                pessoa.setDependente(dependente);
                repository.save(pessoa);
                this.nome="";
                this.cpf="";
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }
}
