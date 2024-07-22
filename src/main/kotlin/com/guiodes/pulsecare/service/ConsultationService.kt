package com.guiodes.pulsecare.service

import com.guiodes.pulsecare.domain.model.ConsultationModel
import com.guiodes.pulsecare.repository.ConsultationRepository
import org.springframework.stereotype.Service

@Service
class ConsultationService(
    private val consultationRepository: ConsultationRepository
): BaseService<ConsultationModel>(consultationRepository) {
    fun callNextPatient() {
        TODO()
    }

    fun finishConsultation(consultationModel: ConsultationModel) {
        TODO()
    }
}