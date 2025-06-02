package br.com.registros.agro.controller;

import br.com.registros.agro.domain.ImpactoAmbiental;
import br.com.registros.agro.domain.ImpactoEconomico;
import br.com.registros.agro.service.ImpactoAmbientalService;
import br.com.registros.agro.service.ImpactoEconomicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/impacto-economico")
public class  ImpactoEconomicoController {

    @Autowired
    private ImpactoEconomicoService impactoEconomicoService;

    @PostMapping
    public ResponseEntity<ImpactoEconomico> cadastrar(@RequestBody ImpactoEconomico impactoEconomico) {
        ImpactoEconomico novoImpactoEconomico = impactoEconomicoService.salvar(impactoEconomico);
        return ResponseEntity.ok(novoImpactoEconomico);
    }

    @GetMapping
    public ResponseEntity<List<ImpactoEconomico>> listarTodos() {
        List<ImpactoEconomico> impactos = impactoEconomicoService.listarTodos();
        return ResponseEntity.ok(impactos);
    }
}
