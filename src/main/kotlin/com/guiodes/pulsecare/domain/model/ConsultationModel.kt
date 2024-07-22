package com.guiodes.pulsecare.domain.model

import java.time.LocalDateTime

data class ConsultationModel(
    val id: Long? = null,
    val patientBracelet: PatientBraceletModel,
    val doctor: EmployeeModel,
    val startedAt: LocalDateTime,
    val endedAt: LocalDateTime,
    val observations: String? = null
)
