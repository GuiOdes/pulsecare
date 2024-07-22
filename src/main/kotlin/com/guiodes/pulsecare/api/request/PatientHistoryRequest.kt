package com.guiodes.pulsecare.api.request

data class PatientHistoryRequest(
    val chronicallyDiseases: String,
    val predisposedDiseases: String
)
