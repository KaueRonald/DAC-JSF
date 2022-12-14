package com.jsf.atividade.beans;

import com.jsf.atividade.models.Pessoa;
import com.jsf.atividade.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
@ManagedBean
@Component
public class HomeBean {
    private List<Pessoa> list = new ArrayList<Pessoa>();
    @Autowired
    private PessoaRepository repository;

    private String cpf;
    private Pessoa pessoa;

    public void getAllPessoas(){
        this.list = repository.findAll();
    }

    public void getPessoaByCpf(){
        if(cpf != null){
            Pessoa pessoa = repository.findByCpf(cpf);
            if(pessoa != null){
                this.pessoa = pessoa;
            }else{
                Pessoa p = new Pessoa(Long.valueOf(0), "Não Encontrado", "Não Encontrado");
                this.pessoa = p;
            }
        }
    }
    public void deletePessoaById(Long id){
        repository.deleteById(id);
    }

    public List<Pessoa> getList() {
        return list;
    }

    public void setList(List<Pessoa> list) {
        this.list = list;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
