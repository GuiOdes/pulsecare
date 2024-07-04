package com.guiodes.pulsecare.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToOne
import jakarta.persistence.Table
import javax.naming.Name

@Entity
@Table(name = "HISTORY")
class PatientHistoryEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(name = "CHRONIC_DISEASE")
    val chronicallyDiseases: String,
    @Column(name = "PREDISPOSITIONS")
    val predisposedDiseases: String
)