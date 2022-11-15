package com.jsf.atividade.controllers;

import com.jsf.atividade.models.Dependente;
import com.jsf.atividade.services.DependenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class DependenteController {

    @Autowired
    private DependenteService service;

    @GetMapping("/getAllDependentes")
    public ResponseEntity<List<Dependente>> getAllDependentes(){
        List<Dependente> list = service.getAllDependentes();
        return ResponseEntity.ok().body(list);
    }
}
