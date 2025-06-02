package br.com.registros.agro.controller;


import br.com.registros.agro.domain.Queimada;
import br.com.registros.agro.service.QueimadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/queimadas")
public class QueimadaController {

    @Autowired
    private QueimadaService queimadaService;

    @PostMapping
    public ResponseEntity<Queimada> cadastrar(@RequestBody Queimada queimada) {
        Queimada novaQueimada = queimadaService.salvar(queimada);
        return ResponseEntity.ok(novaQueimada);
    }

    @GetMapping
    public ResponseEntity<List<Queimada>> listarTodos() {
        List<Queimada> queimadas = queimadaService.listarTodos();
        return ResponseEntity.ok(queimadas);
    }
}

