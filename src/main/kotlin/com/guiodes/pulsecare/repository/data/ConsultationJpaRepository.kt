package com.guiodes.pulsecare.repository.data

import com.guiodes.pulsecare.domain.model.ConsultationModel
import org.springframework.data.jpa.repository.JpaRepository

interface ConsultationJpaRepository: JpaRepository<ConsultationModel, Long>