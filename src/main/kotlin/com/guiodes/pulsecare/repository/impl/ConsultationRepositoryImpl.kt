package com.guiodes.pulsecare.repository.impl

import com.guiodes.pulsecare.domain.entity.ConsultationEntity
import com.guiodes.pulsecare.repository.ConsultationRepository
import com.guiodes.pulsecare.repository.data.ConsultationJpaRepository
import org.springframework.stereotype.Repository

@Repository
class ConsultationRepositoryImpl(
    private val consultationJpaRepository: ConsultationJpaRepository
): ConsultationRepository, BaseRepositoryImpl<ConsultationEntity>(consultationJpaRepository)