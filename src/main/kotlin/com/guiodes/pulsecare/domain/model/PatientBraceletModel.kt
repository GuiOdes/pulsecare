package com.guiodes.pulsecare.domain.model

import java.time.LocalDateTime

data class PatientBraceletModel(
    val id: Long? = null,
    val patient: PatientModel,
    val bracelet: BraceletModel,
    val complaint: String,
    val isActive: Boolean,
    val createdAt: LocalDateTime? = null
)
