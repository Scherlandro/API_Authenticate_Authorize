package com.authenticate.repository;


import com.authenticate.model.AlmoxarifadoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlmoxarifadoRepository extends JpaRepository<AlmoxarifadoModel, Integer> {

    boolean existsByPlaca(String placa);

    boolean existsByDisponibilidade(Boolean disponibilidade);
}
