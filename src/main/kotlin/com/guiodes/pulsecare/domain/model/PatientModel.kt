package com.guiodes.pulsecare.domain.model

import com.guiodes.pulsecare.domain.enum.GenderEnum
import jakarta.validation.constraints.NotNull
import java.time.LocalDate

data class PatientModel(
    val id: Long? = null,
    val name: String? = null,
    val phone: String? = null,
    val birthDate: LocalDate? = null,
    val document: String? = null,
    @field:NotNull(message = "This field is required")
    val gender: GenderEnum,
    val medicalHistory: PatientHistoryModel? = null,
    val createdAt: LocalDate? = null
)
