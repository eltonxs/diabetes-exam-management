package com.ms.exame.diabetes.domain.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "exames")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Exame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExame;

    @Column(nullable = false)
    private Long idPaciente;

    @Column(nullable = false)
    private Double resultadoExame;

    @Column(nullable = false)
    private LocalDateTime dataExame;

    public String getClassificacaoDiabetes() {
        if (resultadoExame < 5.7) {
            return "Normal";
        } else if (resultadoExame >= 5.7 && resultadoExame < 6.5) {
            return "Pré-diabetes";
        }
        return "Diabetes";
    }
}
