package com.guiodes.pulsecare.repository.data

import com.guiodes.pulsecare.domain.model.ProntuaryModel
import com.guiodes.pulsecare.entities.ProntuaryEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ProntuaryJpaRepository:JpaRepository<ProntuaryModel, Long> {
    fun findBYPatientsBracelets():List<ProntuaryEntity?>
    fun findBYPatientBracelet(patientBraceletId: Long):ProntuaryEntity?


}