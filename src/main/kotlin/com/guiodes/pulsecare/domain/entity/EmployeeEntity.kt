package com.guiodes.pulsecare.domain.entity

import com.guiodes.pulsecare.domain.enum.EmployeeType
import com.guiodes.pulsecare.domain.model.EmployeeModel
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.Table
import java.time.LocalDate

@Entity
class EmployeeEntity(
    val name: String,
    val phone: String,
    val email: String,
    val birthDate: LocalDate,
    @Column(unique = true)
    val document: String,

    @Enumerated(EnumType.STRING)
    val type: EmployeeType
): BaseEntity() {

    fun toModel() = EmployeeModel(
        id = id,
        name = name,
        phone = phone,
        email = email,
        birthDate = birthDate,
        document = document,
        type = type
    )
}
