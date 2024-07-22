package com.guiodes.pulsecare.repository.impl

import com.guiodes.pulsecare.domain.entity.PatientHistoryEntity
import com.guiodes.pulsecare.repository.PatientHistoryRepository
import com.guiodes.pulsecare.repository.data.PatientHistoryJpaRepository
import org.springframework.stereotype.Repository

@Repository
class PatientHistoryRepositoryImpl(
    private val repository: PatientHistoryJpaRepository
): PatientHistoryRepository, BaseRepositoryImpl<PatientHistoryEntity>(repository)