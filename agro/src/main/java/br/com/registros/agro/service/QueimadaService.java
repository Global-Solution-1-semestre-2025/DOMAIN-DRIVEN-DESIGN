package br.com.registros.agro.service;


import br.com.registros.agro.domain.Queimada;
import br.com.registros.agro.repository.QueimadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueimadaService {

    @Autowired
    private QueimadaRepository queimadaRepository;

    public Queimada salvar(Queimada queimada) {
        return queimadaRepository.save(queimada);
    }

    public List<Queimada> listarTodos() {
        return queimadaRepository.findAll();
    }
}

