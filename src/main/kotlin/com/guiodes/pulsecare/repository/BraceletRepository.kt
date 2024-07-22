package com.guiodes.pulsecare.repository

import com.guiodes.pulsecare.domain.entity.BraceletEntity
import com.guiodes.pulsecare.domain.model.BraceletModel

interface BraceletRepository: BaseRepository<BraceletEntity> {
    fun findByColor(color: String): BraceletEntity?
}