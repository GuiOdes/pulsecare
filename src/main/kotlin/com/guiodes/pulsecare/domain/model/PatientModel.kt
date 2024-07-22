package com.guiodes.pulsecare.domain.model

import com.guiodes.pulsecare.domain.enum.GenderEnum
import java.time.LocalDateTime

data class PatientModel(
    val id: Long? = null,
    val name: String? = null,
    val phone: String? = null,
    val birthDate: LocalDateTime? = null,
    val document: String? = null,
    val gender: GenderEnum,
    val medicalHistory: PatientHistoryModel? = null,
    val createdAt: LocalDateTime? = null
)
