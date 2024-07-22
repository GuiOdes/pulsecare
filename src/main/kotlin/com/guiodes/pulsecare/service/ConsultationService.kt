package com.guiodes.pulsecare.service

import com.guiodes.pulsecare.api.request.CreateConsultationRequest
import com.guiodes.pulsecare.domain.model.ConsultationModel
import com.guiodes.pulsecare.repository.ConsultationRepository
import org.springframework.stereotype.Service

@Service
class ConsultationService(
    private val consultationRepository: ConsultationRepository
) {
    fun callNextPatient() {
        TODO()
    }

    fun finishConsultation(consultationId: Long) {
        TODO()
    }

    fun saveOrUpdate(request: CreateConsultationRequest): ConsultationModel {
        TODO("Not yet implemented")
    }

    fun findById(id: Long): ConsultationModel {
        TODO("Not yet implemented")
    }

    fun findAll(): List<ConsultationModel> {
        TODO("Not yet implemented")
    }

    fun delete(id: Int) {
        TODO("Not yet implemented")
    }
}