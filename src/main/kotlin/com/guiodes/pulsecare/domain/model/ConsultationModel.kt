package com.guiodes.pulsecare.domain.model

import java.time.LocalDate

data class ConsultationModel(
    val id: Long? = null,
    val patientBracelet: PatientBraceletModel,
    val doctor: EmployeeModel,
    val startedAt: LocalDate,
    val endedAt: LocalDate,
    val observations: String? = null
)
