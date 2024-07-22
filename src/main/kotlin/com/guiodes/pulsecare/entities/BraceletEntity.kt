package com.guiodes.pulsecare.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDate
import java.time.LocalDateTime

@Entity
@Table(name = "BRACELET")
class BraceletEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(name = "COLOR")
    val color:String,
    @Column(name = "PRIORITY")
    val priority: Int,
    @Column(name = "CREATED_AT")
    @CreationTimestamp
    val createdAt: LocalDateTime? = null
)
