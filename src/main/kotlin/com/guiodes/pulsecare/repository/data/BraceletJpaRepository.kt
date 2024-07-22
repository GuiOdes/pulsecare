package com.guiodes.pulsecare.repository.data

import com.guiodes.pulsecare.domain.entity.BraceletEntity
import com.guiodes.pulsecare.domain.model.BraceletModel
import org.springframework.data.jpa.repository.JpaRepository

interface BraceletJpaRepository:JpaRepository<BraceletEntity, Long> {
    fun findByColor(color: String): BraceletEntity?
}