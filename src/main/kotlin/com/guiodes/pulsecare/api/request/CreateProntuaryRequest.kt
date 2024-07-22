package com.guiodes.pulsecare.api.request

data class CreateProntuaryRequest(
    val patientBraceletId: Long,
    val temperatureInCelsius: Double,
    val arterialPressure: String,
    val heightInCm: Double,
    val weightInKg: Double,
    val employeeId: Long
)
