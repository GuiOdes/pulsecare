package com.guiodes.pulsecare.repository.data

import com.guiodes.pulsecare.domain.entity.PatientHistoryEntity
import com.guiodes.pulsecare.domain.model.PatientHistoryModel
import org.springframework.data.jpa.repository.JpaRepository

interface PatientHistoryJpaRepository:JpaRepository<PatientHistoryEntity, Long>