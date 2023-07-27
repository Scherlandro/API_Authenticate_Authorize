package com.authenticate.repository;

import com.authenticate.model.PaisModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaisRepository extends JpaRepository<PaisModel, Integer> {

  @Query(value = "select p from PaisModel p where trim(p.nome_pais) like %?1")
  List<PaisModel> busarPorNome_pais(String nome_pais);
}
