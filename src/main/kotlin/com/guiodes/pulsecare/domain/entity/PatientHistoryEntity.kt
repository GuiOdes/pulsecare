package com.guiodes.pulsecare.domain.entity

import com.guiodes.pulsecare.domain.model.PatientHistoryModel
import jakarta.persistence.Entity

@Entity
class PatientHistoryEntity(
    val chronicallyDiseases: String,
    val predisposedDiseases: String
): BaseEntity() {
    fun toModel() = PatientHistoryModel(
        id = id,
        chronicallyDiseases = chronicallyDiseases,
        predisposedDiseases = predisposedDiseases
    )
}
