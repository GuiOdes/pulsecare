package com.guiodes.pulsecare.repository.data

import com.guiodes.pulsecare.domain.entity.ProntuaryEntity
import com.guiodes.pulsecare.domain.model.ProntuaryModel
import org.springframework.data.jpa.repository.JpaRepository

interface ProntuaryJpaRepository:JpaRepository<ProntuaryEntity, Long>