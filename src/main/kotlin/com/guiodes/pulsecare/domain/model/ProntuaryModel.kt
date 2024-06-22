package com.guiodes.pulsecare.domain.model

import java.time.LocalDate

data class ProntuaryModel(
    val id: Long? = null,
    val patientBracelet: PatientBraceletModel,
    val temperatureInCelsius: Double,
    val arterialPressure: String,
    val heightInCm: Double,
    val weightInKg: Double,
    val createdAt: LocalDate? = null,
    val registeredBy: EmployeeModel
) {

    val patientHistory get() = patientBracelet.patient.medicalHistory
}
