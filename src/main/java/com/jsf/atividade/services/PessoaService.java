package com.jsf.atividade.services;

import com.jsf.atividade.models.Pessoa;
import com.jsf.atividade.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public List<Pessoa> getAllPessoas(){
        return repository.findAll();
    }

    public Pessoa addNewPessoa(Pessoa pessoa){
        Pessoa result = repository.save(pessoa);
        return result;
    }
}
