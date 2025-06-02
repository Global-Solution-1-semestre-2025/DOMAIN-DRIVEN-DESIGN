package br.com.registros.agro.controller;

import br.com.registros.agro.domain.ImpactoAmbiental;
import br.com.registros.agro.domain.Queimada;
import br.com.registros.agro.service.ImpactoAmbientalService;
import br.com.registros.agro.service.QueimadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/impacto-ambiental")
public class  ImpactoAmbientalController {

    @Autowired
    private ImpactoAmbientalService impactoAmbientalService;

    @PostMapping
    public ResponseEntity<ImpactoAmbiental> cadastrar(@RequestBody ImpactoAmbiental impactoAmbiental) {
        ImpactoAmbiental novoImpactoAmbiental = impactoAmbientalService.salvar(impactoAmbiental);
        return ResponseEntity.ok(novoImpactoAmbiental);
    }

    @GetMapping
    public ResponseEntity<List<ImpactoAmbiental>> listarTodos() {
        List<ImpactoAmbiental> impactos = impactoAmbientalService.listarTodos();
        return ResponseEntity.ok(impactos);
    }
}
