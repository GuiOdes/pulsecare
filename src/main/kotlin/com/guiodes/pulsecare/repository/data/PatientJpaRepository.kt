package com.guiodes.pulsecare.repository.data

import com.guiodes.pulsecare.domain.model.PatientModel
import com.guiodes.pulsecare.entities.PatientEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PatientJpaRepository:JpaRepository<PatientModel, Long>{
    fun findByName(name:String): PatientEntity?
    fun findByDocument(document: String): PatientEntity?

}