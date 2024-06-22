package com.guiodes.pulsecare.domain.model

import com.guiodes.pulsecare.domain.enum.GenderEnum
import java.time.LocalDate

data class PatientModel(
    val id: Long? = null,
    val name: String,
    val phone: String,
    val birthDate: LocalDate,
    val document: String,
    val gender: GenderEnum,
    val medicalHistory: PatientHistoryModel,
    val createdAt: LocalDate? = null
)
