package com.guiodes.pulsecare.api.request

data class CreatePatientBraceletRequest(
    val braceletColor: String,
    val complaint: String
)
