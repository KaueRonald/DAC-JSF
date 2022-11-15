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

    public void getAllPessoas(){
        this.list = repository.findAll();
    }

    public List<Pessoa> getList() {
        return list;
    }

    public void setList(List<Pessoa> list) {
        this.list = list;
    }
}
