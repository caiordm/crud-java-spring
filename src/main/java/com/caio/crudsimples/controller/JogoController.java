package com.caio.crudsimples.controller;

import com.caio.crudsimples.entities.Jogo;
import com.caio.crudsimples.repository.JogoRepository;
import com.caio.crudsimples.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JogoController {

    @Autowired
    private JogoService service;

    @PostMapping("/add")
    public Jogo add(@RequestBody Jogo jogo) {
        return service.salvarJogo(jogo);
    }

    @GetMapping("/jogos")
    public List<Jogo> findAll() {
        return service.listarJogos();
    }

    @GetMapping("/jogoPorId/{id}")
    public Jogo findJogoById(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteJogo(@PathVariable Long id) {
        return service.deleteJogo(id);
    }
}
