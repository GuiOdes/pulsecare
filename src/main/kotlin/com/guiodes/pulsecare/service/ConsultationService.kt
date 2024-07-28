package com.guiodes.pulsecare.service

import com.guiodes.pulsecare.api.request.CreateConsultationRequest
import com.guiodes.pulsecare.domain.entity.ConsultationEntity
import com.guiodes.pulsecare.domain.model.ConsultationModel
import com.guiodes.pulsecare.repository.ConsultationRepository
import com.guiodes.pulsecare.repository.EmployeeRepository
import com.guiodes.pulsecare.repository.ProntuaryRepository
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class ConsultationService(
    private val consultationRepository: ConsultationRepository,
    private val prontuaryRepository: ProntuaryRepository,
    private val employeeRepository: EmployeeRepository
) {
    fun callNextPatient() {
        TODO()
    }

    fun finishConsultation(consultationId: Long) = consultationRepository.findById(consultationId)?.let {
        consultationRepository.saveOrUpdate(it.copy(endedAt = LocalDateTime.now()))
    } ?: throw RuntimeException("Consultation not found")

    fun saveOrUpdate(request: CreateConsultationRequest): ConsultationModel {
        val prontuary = prontuaryRepository.findAll().last {
            it.patientBracelet.id == request.patientBraceletId
        }
        val doctor = employeeRepository.findById(request.doctorId) ?: throw RuntimeException("Doctor not found")

        return consultationRepository.saveOrUpdate(
            ConsultationEntity.of(request = request, prontuary = prontuary, doctor = doctor)
        ).toModel()
    }

    fun findAll() = consultationRepository.findAll().map { it.toModel() }
}