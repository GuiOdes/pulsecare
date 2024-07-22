package com.guiodes.pulsecare.domain.entity

import com.guiodes.pulsecare.domain.enum.GenderEnum
import com.guiodes.pulsecare.domain.model.PatientHistoryModel
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToOne
import jakarta.persistence.Table
import java.time.LocalDate

@Entity
class PatientEntity(
    val name: String? = null,

    val phone: String? = null,

    val birthDate: LocalDate? = null,

    @Column(unique = true)
    val document: String? = null,

    @Enumerated(EnumType.STRING)
    val gender: GenderEnum,

    @JoinColumn
    @OneToOne
    val medicalHistory: PatientHistoryEntity? = null
): BaseEntity()