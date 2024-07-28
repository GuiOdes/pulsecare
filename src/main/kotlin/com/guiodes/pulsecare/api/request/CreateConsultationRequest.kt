package com.guiodes.pulsecare.api.request

import java.time.LocalDateTime

data class CreateConsultationRequest(
    val patientBraceletId: Long,
    val doctorId: Long,
    val startedAt: LocalDateTime,
    val endedAt: LocalDateTime,
    val observations: String
)
