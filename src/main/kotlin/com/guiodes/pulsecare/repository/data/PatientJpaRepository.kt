package com.guiodes.pulsecare.repository.data

import com.guiodes.pulsecare.domain.entity.PatientEntity
import com.guiodes.pulsecare.domain.model.PatientModel
import org.springframework.data.jpa.repository.JpaRepository

interface PatientJpaRepository:JpaRepository<PatientEntity, Long>