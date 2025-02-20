package com.ms.exame.diabetes.domain.port;

import com.ms.exame.diabetes.domain.model.Exame;
import java.util.List;
import java.util.Optional;

public interface ExameRepositoryPort {
    Exame salvar(Exame exame);
    Optional<Exame> buscarPorId(Long id);
    List<Exame> listarTodos();
}