package com.ms.exame.diabetes.application.dto;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

public record ExameRequestDTO(
        @NotNull Long idPaciente,
        @NotNull Double resultadoExame,
        @NotNull LocalDateTime dataExame
) {}
