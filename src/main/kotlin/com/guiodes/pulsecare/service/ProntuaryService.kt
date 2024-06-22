package com.guiodes.pulsecare.service

import com.guiodes.pulsecare.domain.model.ProntuaryModel
import com.guiodes.pulsecare.repository.ProntuaryRepository

class ProntuaryService(
    private val prontuaryRepository: ProntuaryRepository
): BaseService<ProntuaryModel>(prontuaryRepository)