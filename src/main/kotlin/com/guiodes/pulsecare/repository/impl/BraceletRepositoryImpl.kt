package com.guiodes.pulsecare.repository.impl

import com.guiodes.pulsecare.domain.entity.BraceletEntity
import com.guiodes.pulsecare.repository.BraceletRepository
import com.guiodes.pulsecare.repository.data.BraceletJpaRepository
import org.springframework.stereotype.Repository

@Repository
class BraceletRepositoryImpl(
    private val repository: BraceletJpaRepository
): BraceletRepository, BaseRepositoryImpl<BraceletEntity>(repository) {
    override fun findByColor(color: String): BraceletEntity? {
        return repository.findByColor(color)
    }
}