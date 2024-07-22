package com.guiodes.pulsecare.api.request

import com.guiodes.pulsecare.domain.enum.GenderEnum
import jakarta.validation.constraints.NotNull
import java.time.LocalDate

data class CreatePatientRequest(
    val name: String? = null,
    val phone: String? = null,
    val birthDate: LocalDate? = null,
    val document: String? = null,
    @field:NotNull(message = "This field is required")
    val gender: GenderEnum,
    val medicalHistory: PatientHistoryRequest? = null
)
