package com.guiodes.pulsecare.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

@Entity
class PatientBraceletEntity(
    @ManyToOne
    val patient: PatientEntity,
    @ManyToOne
    val bracelet: BraceletEntity,
    val complaint: String,
    val isActive: Boolean
): BaseEntity()
