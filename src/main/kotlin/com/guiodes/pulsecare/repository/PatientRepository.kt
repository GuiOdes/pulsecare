package com.guiodes.pulsecare.repository

import com.guiodes.pulsecare.domain.entity.PatientEntity
import com.guiodes.pulsecare.domain.model.PatientModel

interface PatientRepository: BaseRepository<PatientEntity> {
    fun findByNameOrDocument(param: String): PatientModel
}
