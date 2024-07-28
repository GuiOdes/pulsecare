package com.guiodes.pulsecare.domain.entity

import com.guiodes.pulsecare.api.request.CreateConsultationRequest
import com.guiodes.pulsecare.domain.model.ConsultationModel
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.time.LocalDateTime

@Entity
data class ConsultationEntity(

    @ManyToOne
    @JoinColumn(name = "PRONTUARY_ID")
    val prontuary: ProntuaryEntity,

    @ManyToOne
    @JoinColumn(name = "EMPLOYEE_ID")
    val doctor: EmployeeEntity,
    val startedAt: LocalDateTime,
    val endedAt: LocalDateTime,
    val observations: String? = null
): BaseEntity() {

    fun toModel() = ConsultationModel(
        id = id,
        patientBracelet = prontuary.patientBracelet.toModel(),
        doctor = doctor.toModel(),
        startedAt = startedAt,
        endedAt = endedAt,
        observations = observations
    )

    companion object {
        fun of(
            request: CreateConsultationRequest,
            prontuary: ProntuaryEntity,
            doctor: EmployeeEntity
        ): ConsultationEntity {
            return ConsultationEntity(
                prontuary = prontuary,
                doctor = doctor,
                startedAt = request.startedAt,
                endedAt = request.endedAt,
                observations = request.observations
            )
        }
    }
}
