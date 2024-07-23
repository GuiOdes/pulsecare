package com.guiodes.pulsecare.domain.model

import java.time.LocalDateTime

data class ConsultationModel(
    val id: Long? = null,
    val prontuary: Long,
    val doctor: Long,
    val startedAt: LocalDateTime,
    val endedAt: LocalDateTime,
    val observations: String? = null
)
