package com.guiodes.pulsecare.service

import com.guiodes.pulsecare.domain.model.BraceletModel
import com.guiodes.pulsecare.repository.BraceletRepository

class BraceletService(
    private val braceletRepository: BraceletRepository
): BaseService<BraceletModel>(braceletRepository) {
    fun findByColor(color: String) = braceletRepository.findByColor(color)
}