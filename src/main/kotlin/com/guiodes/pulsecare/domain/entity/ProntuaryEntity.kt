package com.guiodes.pulsecare.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToOne

@Entity
class ProntuaryEntity(
    @OneToOne
    @JoinColumn(name = "PATIENT_BRACELET_ID")
    val patientBracelet: PatientBraceletEntity,

    val temperatureInCelsius: Double,
    val arterialPressure: String,
    val heightInCm: Double,
    val weightInKg: Double,

    @ManyToOne
    @JoinColumn(name = "EMPLOYEE_ID")
    val registeredBy: EmployeeEntity
): BaseEntity()
