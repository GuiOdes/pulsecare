package com.guiodes.pulsecare.repository.impl

import com.guiodes.pulsecare.domain.entity.PatientBraceletEntity
import com.guiodes.pulsecare.domain.entity.PatientHistoryEntity
import com.guiodes.pulsecare.repository.PatientBraceletRepository
import com.guiodes.pulsecare.repository.data.PatientBraceletJpaRepository
import com.guiodes.pulsecare.repository.data.PatientHistoryJpaRepository
import org.springframework.stereotype.Repository

@Repository
class PatientBraceletRepositoryImpl(
    private val repository: PatientBraceletJpaRepository
): PatientBraceletRepository, BaseRepositoryImpl<PatientBraceletEntity>(repository)