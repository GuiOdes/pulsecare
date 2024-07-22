package com.guiodes.pulsecare.api.request

import com.guiodes.pulsecare.domain.enum.EmployeeType
import java.time.LocalDate

data class CreateEmployeeRequest(
    val name: String,
    val phone: String,
    val email: String,
    val birthDate: LocalDate,
    val document: String,
    val type: EmployeeType,
)
