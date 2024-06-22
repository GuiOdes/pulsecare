package com.guiodes.pulsecare.repository

import com.guiodes.pulsecare.domain.model.BraceletModel

interface BraceletRepository: BaseRepository<BraceletModel> {
    fun findByColor(color: String): BraceletModel?
}