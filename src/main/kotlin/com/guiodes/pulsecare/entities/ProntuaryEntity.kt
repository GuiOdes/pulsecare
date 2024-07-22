package com.guiodes.pulsecare.entities

import com.guiodes.pulsecare.domain.model.EmployeeModel
import com.guiodes.pulsecare.domain.model.PatientBraceletModel
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToMany
import jakarta.persistence.OneToOne
import jakarta.persistence.Table
import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDate
@Entity
@Table(name = "PRONTUARY")
class ProntuaryEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @JoinColumn(name = "PATIENT_BRACELET_ID")
    @OneToOne
    val patientBracelet: PatientBraceletEntity,
    @Column(name = "TEMPERATURE")
    val temperatureInCelsius: Double,
    @Column(name = "ARTERIAL_PRESSURE")
    val arterialPressure: String,
    @Column(name = "HEIGHT")
    val heightInCm: Double,
    @Column(name = "WEIGHT")
    val weightInKg: Double,
    @Column(name = "CREATED_AT")
    @CreationTimestamp
    val createdAt: LocalDate? = null,
    @JoinColumn(name = "EMPLOYEE_ID")
    @OneToMany
    val registeredBy: EmployeeEntity
)