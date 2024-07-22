package com.guiodes.pulsecare.repository.impl

import com.guiodes.pulsecare.domain.entity.PatientEntity
import com.guiodes.pulsecare.repository.PatientRepository
import com.guiodes.pulsecare.repository.data.PatientJpaRepository
import org.springframework.stereotype.Repository

@Repository
class PatientRepositoryImpl(
    private val repository: PatientJpaRepository
): PatientRepository, BaseRepositoryImpl<PatientEntity>(repository)