package com.ms.exame.diabetes.infrastructure.adapter;

import com.ms.exame.diabetes.domain.model.Exame;
import com.ms.exame.diabetes.domain.port.ExameRepositoryPort;
import com.ms.exame.diabetes.infrastructure.repository.ExameRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ExameRepositoryAdapter implements ExameRepositoryPort {

    private final ExameRepository repository;

    public ExameRepositoryAdapter(ExameRepository repository) {
        this.repository = repository;
    }

    @Override
    public Exame salvar(Exame exame) {
        return repository.save(exame);
    }

    @Override
    public Optional<Exame> buscarPorId(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Exame> listarTodos() {
        return repository.findAll();
    }


}