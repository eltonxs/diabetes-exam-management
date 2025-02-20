package com.ms.exame.diabetes.entrypoint.controller;

import com.ms.exame.diabetes.application.dto.ExameRequestDTO;
import com.ms.exame.diabetes.application.dto.ExameResponseDTO;
import com.ms.exame.diabetes.application.service.ExameService;
import com.ms.exame.diabetes.domain.model.Exame;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exames")
@RequiredArgsConstructor
public class ExameController {

    private final ExameService service;

    @PostMapping
    public ResponseEntity<ExameResponseDTO> cadastrar(@Valid @RequestBody ExameRequestDTO dto) {
        Exame exame = service.salvar(dto);

        return ResponseEntity.ok(new ExameResponseDTO(
                exame.getIdExame(),
                exame.getIdPaciente(),
                exame.getResultadoExame(),
                exame.getClassificacaoDiabetes(),
                exame.getDataExame()
        ));
    }

    @GetMapping
    public ResponseEntity<List<ExameResponseDTO>> listarTodos() {
        List<ExameResponseDTO> exames = service.listarTodos().stream()
                .map(exame -> new ExameResponseDTO(
                        exame.getIdExame(),
                        exame.getIdPaciente(),
                        exame.getResultadoExame(),
                        exame.getClassificacaoDiabetes(),
                        exame.getDataExame()
                )).toList();

        return ResponseEntity.ok(exames);
    }
}
