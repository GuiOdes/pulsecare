package com.guiodes.pulsecare.domain.model

import java.time.LocalDate
import java.time.LocalDateTime

data class BraceletModel(
    val id: Long? = null,
    val color: String,
    val priority: Int,
    val createdAt: LocalDateTime? = null
)
