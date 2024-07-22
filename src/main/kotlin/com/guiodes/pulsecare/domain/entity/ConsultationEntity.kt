package com.guiodes.pulsecare.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.time.LocalDateTime

@Entity
class ConsultationEntity(

    @ManyToOne
    @JoinColumn(name = "PRONTUARY_ID")
    val prontuary: ProntuaryEntity,

    @ManyToOne
    @JoinColumn(name = "EMPLOYEE_ID")
    val doctor: EmployeeEntity,
    val startedAt: LocalDateTime,
    val endedAt: LocalDateTime,
    val observations: String? = null
): BaseEntity()
