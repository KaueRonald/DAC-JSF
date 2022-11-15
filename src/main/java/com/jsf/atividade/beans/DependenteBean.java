package com.jsf.atividade.beans;

import com.jsf.atividade.models.Dependente;
import com.jsf.atividade.models.Pessoa;
import com.jsf.atividade.repositories.DependentesRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ManagedBean
@RequestScoped
public class DependenteBean {
    private List<Dependente> dependentes = new ArrayList<Dependente>();

    @Autowired
    private DependentesRepository repository;

    public void listDependente(){
        Dependente d1 = new Dependente();
        Dependente d2 = new Dependente();
        Dependente d3 = new Dependente();

        d1.setNome("Teste1");
        d2.setNome("Teste2");
        d3.setNome("teste3");


        this.dependentes = repository.saveAll(Arrays.asList(d1,d2,d3));
    }

    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(List<Dependente> dependentes) {
        this.dependentes = dependentes;
    }
}
