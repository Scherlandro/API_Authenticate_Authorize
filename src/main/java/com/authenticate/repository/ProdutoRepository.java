package com.authenticate.repository;

import com.authenticate.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Integer> {

    @Query(value = "select p from ProdutoModel p where trim(p.nome_produto) like %?1%")
    List<ProdutoModel> buscarPorNome(String nome);
}
