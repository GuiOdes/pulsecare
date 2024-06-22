package com.guiodes.pulsecare.service

import com.guiodes.pulsecare.domain.model.ConsultationModel
import com.guiodes.pulsecare.repository.ConsultationRepository

class ConsultationService(
    private val consultationRepository: ConsultationRepository
): BaseService<ConsultationModel>(consultationRepository)