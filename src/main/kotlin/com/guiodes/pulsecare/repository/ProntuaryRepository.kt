package com.guiodes.pulsecare.repository

import com.guiodes.pulsecare.domain.entity.ProntuaryEntity

interface ProntuaryRepository: BaseRepository<ProntuaryEntity> {
    fun existsByPatient(patientId: Long): Boolean
}