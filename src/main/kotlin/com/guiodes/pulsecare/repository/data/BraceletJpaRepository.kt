package com.guiodes.pulsecare.repository.data

import com.guiodes.pulsecare.domain.model.BraceletModel
import com.guiodes.pulsecare.entities.BraceletEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface BraceletJpaRepository:JpaRepository<BraceletModel, Long>{
    fun findByColor(color: String):BraceletEntity?
}