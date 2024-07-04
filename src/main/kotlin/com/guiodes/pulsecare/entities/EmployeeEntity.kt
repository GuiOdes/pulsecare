package com.guiodes.pulsecare.entities

import com.guiodes.pulsecare.domain.enum.EmployeeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDate
import java.time.LocalDateTime

@Entity
@Table(name = "EMPLOYEE")
class EmployeeEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column
    val name: String,
    @Column
    val phone: String,
    @Column
    val email: String,
    @Column
    val birthDate: LocalDate,
    @Column
    val document: String,
    @Column
    @Enumerated(EnumType.STRING)
    val type: EmployeeType,
    @Column(name = "CREATED_AT")
    @CreationTimestamp
    val createdAt: LocalDateTime? = null
)