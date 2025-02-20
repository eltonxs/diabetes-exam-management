package com.ms.exame.diabetes.application.service;

import com.ms.exame.diabetes.application.dto.ExameRequestDTO;
import com.ms.exame.diabetes.domain.model.Exame;
import com.ms.exame.diabetes.infrastructure.GlycatedHemoglobinCreatedEventSupplier;
import com.ms.exame.diabetes.infrastructure.adapter.ExameRepositoryAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExameService {

    private final ExameRepositoryAdapter repository;
    private final GlycatedHemoglobinCreatedEventSupplier glycatedHemoglobinCreatedEventSupplier;

    public Exame salvar(ExameRequestDTO dto) {
        Exame exame = Exame.builder()
                .idPaciente(dto.idPaciente())
                .resultadoExame(dto.resultadoExame())
                .dataExame(dto.dataExame())
                .build();
        Exame exameRetorno = repository.salvar(exame);
      glycatedHemoglobinCreatedEventSupplier.sendGlycatedHemoglobinCreatedEvent(exameRetorno);
        return exameRetorno;
    }

    public List<Exame> listarTodos() {
        return repository.listarTodos();
    }
}
