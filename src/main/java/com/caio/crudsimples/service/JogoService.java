package com.caio.crudsimples.service;

import com.caio.crudsimples.entities.Jogo;
import com.caio.crudsimples.repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogoService {
    private final JogoRepository jogoRepository;

    @Autowired
    public JogoService(JogoRepository jogoRepository) {
        this.jogoRepository = jogoRepository;
    }

    public List<Jogo> listarJogos() {
        return jogoRepository.findAll();
    }

    public Jogo salvarJogo(Jogo jogo) {
        return jogoRepository.save(jogo);
    }

    public void deletarJogo(Long id) {
        jogoRepository.deleteById(id);
    }

    public Jogo buscarPorId(Long id){
        return jogoRepository.findById(id).orElse(null);
    }


}
