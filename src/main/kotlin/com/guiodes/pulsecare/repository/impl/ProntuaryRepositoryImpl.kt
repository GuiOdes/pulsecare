package com.guiodes.pulsecare.repository.impl

import com.guiodes.pulsecare.domain.entity.ProntuaryEntity
import com.guiodes.pulsecare.repository.ProntuaryRepository
import com.guiodes.pulsecare.repository.data.ProntuaryJpaRepository
import org.springframework.stereotype.Repository

@Repository
class ProntuaryRepositoryImpl(
    private val repository: ProntuaryJpaRepository
): ProntuaryRepository, BaseRepositoryImpl<ProntuaryEntity>(repository)