package com.guiodes.pulsecare.domain.model

import java.time.LocalDate

data class BraceletModel(
    val id: Long? = null,
    val color: String,
    val priority: Int,
    val createdAt: LocalDate? = null
)
