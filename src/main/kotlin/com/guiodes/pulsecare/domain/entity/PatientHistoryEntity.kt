package com.guiodes.pulsecare.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
class PatientHistoryEntity(
    val chronicallyDiseases: String,
    val predisposedDiseases: String
): BaseEntity()
