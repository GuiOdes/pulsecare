package com.guiodes.pulsecare.service

import com.guiodes.pulsecare.api.request.CreateProntuaryRequest
import com.guiodes.pulsecare.domain.model.ProntuaryModel
import com.guiodes.pulsecare.repository.ProntuaryRepository
import org.springframework.stereotype.Service

@Service
class ProntuaryService(
    private val prontuaryRepository: ProntuaryRepository
) {
    fun callNextPatient() {
        TODO()
    }

    fun saveOrUpdate(request: CreateProntuaryRequest): ProntuaryModel {
        TODO("Not yet implemented")
    }
}