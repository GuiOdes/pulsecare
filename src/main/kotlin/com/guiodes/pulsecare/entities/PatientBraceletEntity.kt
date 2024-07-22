package com.guiodes.pulsecare.entities

import com.guiodes.pulsecare.domain.model.BraceletModel
import com.guiodes.pulsecare.domain.model.PatientModel
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany
import jakarta.persistence.Table
import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDate
import java.time.LocalDateTime

@Entity
@Table(name = "PATIENT_BRACELET")
class PatientBraceletEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @JoinColumn(name = "PATIENT_ID")
    @ManyToOne
    val patient: PatientEntity,
    @JoinColumn(name = "BRACELET_ID")
    @ManyToOne
    val bracelet: BraceletEntity,
    @Column
    val complaint: String,
    @Column(name = "IS_ACTIVE")
    val isActive: Boolean,
    @Column(name = "CREATED_AT")
    @CreationTimestamp
    val createdAt: LocalDateTime? = null
)