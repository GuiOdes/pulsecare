package com.guiodes.pulsecare.repository

import com.guiodes.pulsecare.domain.entity.PatientBraceletEntity

interface PatientBraceletRepository: BaseRepository<PatientBraceletEntity> {
    fun findAllWithoutProntuary(): List<PatientBraceletEntity>
    fun findAllWithoutConsultation(): List<PatientBraceletEntity>
}