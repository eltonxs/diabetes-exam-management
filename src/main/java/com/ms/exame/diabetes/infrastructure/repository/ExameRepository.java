package com.ms.exame.diabetes.infrastructure.repository;

import com.ms.exame.diabetes.domain.model.Exame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExameRepository extends JpaRepository<Exame, Long> {
}