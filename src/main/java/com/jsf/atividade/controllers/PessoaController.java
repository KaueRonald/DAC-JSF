package com.jsf.atividade.controllers;

import com.jsf.atividade.models.Pessoa;
import com.jsf.atividade.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @GetMapping
    public ResponseEntity<List<Pessoa>> getAllPessoas(){
        List<Pessoa> list = service.getAllPessoas();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<Pessoa> addNewPessoa(@RequestBody Pessoa pessoa){
        Pessoa newPessoa = service.addNewPessoa(pessoa);
        return ResponseEntity.ok().body(newPessoa);
    }
}
