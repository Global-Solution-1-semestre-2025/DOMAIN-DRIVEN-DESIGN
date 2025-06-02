package br.com.registros.agro.service;

import br.com.registros.agro.domain.ImpactoAmbiental;
import br.com.registros.agro.domain.Queimada;
import br.com.registros.agro.repository.ImpactoAmbientalRepository;
import br.com.registros.agro.repository.QueimadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ImpactoAmbientalService {

    @Autowired
    private ImpactoAmbientalRepository impactoAmbientalRepository;

    public ImpactoAmbiental salvar(ImpactoAmbiental queimada) {
        return impactoAmbientalRepository.save(queimada);
    }

    public List<ImpactoAmbiental> listarTodos() {
        return impactoAmbientalRepository.findAll();
    }
}
