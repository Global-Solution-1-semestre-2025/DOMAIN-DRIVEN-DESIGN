package br.com.registros.agro.service;
import br.com.registros.agro.domain.ImpactoEconomico;
import br.com.registros.agro.repository.ImpactoEconomicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ImpactoEconomicoService {

    @Autowired
    private ImpactoEconomicoRepository impactoEconomicoRepository;

    public ImpactoEconomico salvar(ImpactoEconomico economico) {
        return impactoEconomicoRepository.save(economico);
    }

    public List<ImpactoEconomico> listarTodos() {
        return impactoEconomicoRepository.findAll();
    }
}

