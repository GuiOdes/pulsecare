package com.guiodes.pulsecare.service

import com.guiodes.pulsecare.domain.model.BraceletModel
import com.guiodes.pulsecare.repository.BraceletRepository
import org.springframework.stereotype.Service

@Service
class BraceletService(
    private val braceletRepository: BraceletRepository
) {
    fun findByColor(color: String) = braceletRepository.findByColor(color)
}