package com.authenticate.service;

import com.authenticate.model.AlmoxarifadoModel;
import com.authenticate.repository.AlmoxarifadoRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class AlmoxarifadoService {

    final AlmoxarifadoRepository almoxarifadoRepository;

    public AlmoxarifadoService(AlmoxarifadoRepository repository) {

        this.almoxarifadoRepository = repository;
    }


    @Transactional
    public AlmoxarifadoModel save(AlmoxarifadoModel almoxarifadoModel) {

        return almoxarifadoRepository.save(almoxarifadoModel);
    }

    public Optional<AlmoxarifadoModel> findById(Integer id) {
        return almoxarifadoRepository.findById(id);
    }

    public List<AlmoxarifadoModel> findAll() {
        return almoxarifadoRepository.findAll();
    }

    public boolean existsByPlaca(String placa) {
        return almoxarifadoRepository.existsByPlaca(placa);
    }

    public boolean existsByDisponibilidade(Boolean disponibilidade) {
        return almoxarifadoRepository.existsByDisponibilidade(disponibilidade);
    }
}
