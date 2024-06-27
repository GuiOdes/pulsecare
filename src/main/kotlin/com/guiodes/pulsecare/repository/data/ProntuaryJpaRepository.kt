package com.guiodes.pulsecare.repository.data

import com.guiodes.pulsecare.domain.model.ProntuaryModel
import org.springframework.data.jpa.repository.JpaRepository

interface ProntuaryJpaRepository:JpaRepository<ProntuaryModel, Long> {
}