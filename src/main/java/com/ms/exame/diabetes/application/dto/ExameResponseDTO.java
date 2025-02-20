package com.ms.exame.diabetes.application.dto;

import java.time.LocalDateTime;

public record ExameResponseDTO(
        Long idExame,
        Long idPaciente,
        Double resultadoExame,
        String classificacaoDiabetes,
        LocalDateTime dataExame
) {}
