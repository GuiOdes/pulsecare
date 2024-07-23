package com.guiodes.pulsecare.service

import com.guiodes.pulsecare.api.request.CreateConsultationRequest
import com.guiodes.pulsecare.domain.entity.ConsultationEntity
import com.guiodes.pulsecare.domain.model.ConsultationModel
import com.guiodes.pulsecare.repository.ConsultationRepository
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class ConsultationService(
    private val consultationRepository: ConsultationRepository
) {
    fun callNextPatient() {
        TODO()
    }

    fun finishConsultation(consultationId: Long) {
        val consultation = consultationRepository.findById(consultationId).toModel()
        consultation.copy(
            endedAt = LocalDateTime.now()
        )
        return consultationRepository.saveOrUpdate(consultation)
    }

    fun saveOrUpdate(request: CreateConsultationRequest): ConsultationModel {
        return consultationRepository.saveOrUpdate(request)
    }

    fun findById(id: Long): ConsultationModel {
        return consultationRepository.findById(id).toModel()
    }

    fun findAll(): List<ConsultationModel> {
        return consultationRepository.findAll()
    }

    fun delete(id: Long) {
        return consultationRepository.delete(id)
    }
}