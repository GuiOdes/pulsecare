package com.guiodes.pulsecare.entities

import com.guiodes.pulsecare.domain.model.EmployeeModel
import com.guiodes.pulsecare.domain.model.PatientBraceletModel
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToOne
import jakarta.persistence.Table
import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDate
import java.time.LocalDateTime

@Entity
@Table(name = "CONSULTATION")
class ConsultationEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @JoinColumn(name = "EMPLOYEE_ID")
    @OneToOne
    val doctor: EmployeeModel,
    @Column(name = "CREATED_AT")
    @CreationTimestamp
    val startedAt: LocalDateTime,
    @Column(name = "END_AT")
    @CreationTimestamp
    val endedAt: LocalDateTime,
    @Column(name = "ANNOTATIONS")
    val observations: String? = null
)