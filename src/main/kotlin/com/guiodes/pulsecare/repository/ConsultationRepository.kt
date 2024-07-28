package com.guiodes.pulsecare.repository

import com.guiodes.pulsecare.domain.entity.ConsultationEntity

interface ConsultationRepository: BaseRepository<ConsultationEntity> {
    fun existsByPatient(id: Long): Boolean
}