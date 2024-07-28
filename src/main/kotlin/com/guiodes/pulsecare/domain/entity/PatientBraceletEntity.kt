package com.guiodes.pulsecare.domain.entity

import com.guiodes.pulsecare.domain.model.PatientBraceletModel
import jakarta.persistence.Entity
import jakarta.persistence.ManyToOne

@Entity
class PatientBraceletEntity(
    @ManyToOne
    val patient: PatientEntity,
    @ManyToOne
    val bracelet: BraceletEntity,
    val complaint: String,
    val isActive: Boolean
): BaseEntity() {
    fun toModel() = PatientBraceletModel(
        id = id,
        patient = patient.toModel(),
        bracelet = bracelet.toModel(),
        complaint = complaint,
        isActive = isActive,
        createdAt = createdAt
    )
}
