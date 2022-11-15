package com.jsf.atividade.repositories;

import com.jsf.atividade.models.Dependente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DependentesRepository extends JpaRepository<Dependente, String> {
}
