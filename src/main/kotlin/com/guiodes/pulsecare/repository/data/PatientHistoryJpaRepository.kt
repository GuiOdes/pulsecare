package com.guiodes.pulsecare.repository.data

import com.guiodes.pulsecare.domain.model.PatientHistoryModel
import org.springframework.data.jpa.repository.JpaRepository

interface PatientHistoryJpaRepository:JpaRepository<PatientHistoryModel, Long>{

}