package com.jsf.atividade.beans;

import com.jsf.atividade.models.Pessoa;
import com.jsf.atividade.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;
import java.util.Optional;

@RequestScoped
@ManagedBean
@Component
public class EditBean {

    private Long id;
    private String nome;
    private String cpf;

    @Autowired
    private PessoaRepository repository;

    public void getPessoaById(Long id) throws IOException {
        Optional<Pessoa> pessoa = repository.findById(id);
        if(pessoa.isPresent()){
            this.nome = pessoa.get().getNome();
            this.id = pessoa.get().getId();
            this.cpf = pessoa.get().getCpf();
            System.out.println(this.nome);

            FacesContext.getCurrentInstance().getExternalContext().redirect("/edit");
        }
    }

    public void editPessoa(Long id) throws IOException {
        Optional<Pessoa> pessoa = repository.findById(id);
        if(pessoa.isPresent()) {
            Pessoa newPessoa = pessoa.get();
            newPessoa.setNome(this.nome);
            newPessoa.setCpf(this.cpf);

            repository.save(newPessoa);
        }
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
