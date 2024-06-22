package com.guiodes.pulsecare.domain.model

import com.guiodes.pulsecare.domain.enum.EmployeeType
import java.time.LocalDate

data class EmployeeModel(
    val id: Long? = null,
    val name: String,
    val phone: String,
    val email: String,
    val birthDate: LocalDate,
    val document: String,
    val type: EmployeeType,
    val createdAt: LocalDate? = null
)
