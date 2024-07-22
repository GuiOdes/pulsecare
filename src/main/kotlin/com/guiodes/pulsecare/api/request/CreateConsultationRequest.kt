package com.guiodes.pulsecare.api.request

import java.time.LocalDate

data class CreateConsultationRequest(
    val patientBraceletId: Long,
    val doctorId: Long,
    val startedAt: LocalDate,
    val endedAt: LocalDate,
    val observations: String
)
