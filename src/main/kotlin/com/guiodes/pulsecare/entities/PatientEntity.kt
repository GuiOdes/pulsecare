package com.guiodes.pulsecare.entities

import com.guiodes.pulsecare.domain.enum.GenderEnum
import com.guiodes.pulsecare.domain.model.PatientHistoryModel
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToOne
import jakarta.persistence.Table
import jakarta.validation.constraints.NotNull
import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDate
import java.time.LocalDateTime

@Entity
@Table(name = "PATIENT")
class PatientEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column
    val name: String? = null,
    @Column
    val phone: String? = null,
    @Column
    val birthDate: LocalDate? = null,
    @Column
    val document: String? = null,
    @Column
    val gender: GenderEnum,
    @Column(name = "PERSONAL_DESCRIPTION")
    val personalDescripition: String? = null,
    @JoinColumn
    @OneToOne(mappedBy = "PATIENT_ID")
    val medicalHistory: PatientHistoryEntity? = null,
    @Column(name = "CREATED_AT")
    @CreationTimestamp
    val createdAt: LocalDateTime? = null
)