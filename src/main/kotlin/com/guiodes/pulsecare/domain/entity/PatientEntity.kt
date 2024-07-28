package com.guiodes.pulsecare.domain.entity

import com.guiodes.pulsecare.api.request.CreatePatientRequest
import com.guiodes.pulsecare.domain.enum.GenderEnum
import com.guiodes.pulsecare.domain.model.PatientModel
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToOne
import java.time.LocalDate

@Entity
data class PatientEntity(
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
): BaseEntity() {
    fun toModel() = PatientModel(
        id = id,
        name = name,
        phone = phone,
        birthDate = birthDate,
        document = document,
        gender = gender,
        medicalHistory = medicalHistory?.toModel(),
        createdAt = createdAt
    )

    companion object {
        fun of(request: CreatePatientRequest) = PatientEntity(
            name = request.name,
            phone = request.phone,
            birthDate = request.birthDate,
            document = request.document,
            gender = request.gender,
            medicalHistory = null
        )
    }
}