package com.guiodes.pulsecare.domain.model

data class PatientHistoryModel(
    val id: Long? = null,
    val chronicallyDiseases: String,
    val predisposedDiseases: String
)
