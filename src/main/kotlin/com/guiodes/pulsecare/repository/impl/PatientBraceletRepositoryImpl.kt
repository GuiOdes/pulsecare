package com.guiodes.pulsecare.repository.impl

import com.guiodes.pulsecare.domain.entity.PatientBraceletEntity
import com.guiodes.pulsecare.domain.entity.PatientHistoryEntity
import com.guiodes.pulsecare.repository.ConsultationRepository
import com.guiodes.pulsecare.repository.PatientBraceletRepository
import com.guiodes.pulsecare.repository.ProntuaryRepository
import com.guiodes.pulsecare.repository.data.PatientBraceletJpaRepository
import com.guiodes.pulsecare.repository.data.PatientHistoryJpaRepository
import org.springframework.stereotype.Repository

@Repository
class PatientBraceletRepositoryImpl(
    private val repository: PatientBraceletJpaRepository,
    private val prontuaryRepository: ProntuaryRepository,
    private val consultationRepository: ConsultationRepository
) : PatientBraceletRepository, BaseRepositoryImpl<PatientBraceletEntity>(repository) {
    override fun findAllWithoutProntuary(): List<PatientBraceletEntity> {
        return repository.findAll(true)
            .filter { !prontuaryRepository.existsByPatient(it.patient.id!!) }
    }

    override fun findAllWithoutConsultation(): List<PatientBraceletEntity> {
        return repository.findAll(true)
            .filter { !consultationRepository.existsByPatient(it.patient.id!!) }
    }
}
