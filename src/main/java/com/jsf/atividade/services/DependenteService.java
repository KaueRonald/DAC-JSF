package com.jsf.atividade.services;

import com.jsf.atividade.models.Dependente;
import com.jsf.atividade.repositories.DependentesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DependenteService {

    @Autowired
    private DependentesRepository repository;

    public List<Dependente> getAllDependentes(){
        return repository.findAll();
    }
}
