package com.guiodes.pulsecare.repository.data

import com.guiodes.pulsecare.domain.entity.PatientBraceletEntity
import com.guiodes.pulsecare.domain.model.PatientBraceletModel
import org.springframework.data.jpa.repository.JpaRepository

interface PatientBraceletJpaRepository:JpaRepository<PatientBraceletEntity, Long>