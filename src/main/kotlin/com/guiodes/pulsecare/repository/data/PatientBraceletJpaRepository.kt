package com.guiodes.pulsecare.repository.data

import com.guiodes.pulsecare.domain.model.PatientBraceletModel
import com.guiodes.pulsecare.entities.PatientBraceletEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PatientBraceletJpaRepository:JpaRepository<PatientBraceletModel, Long>{
    fun findByPatientWherePatientIsActive(patientId: Long, isActive: Boolean = true): PatientBraceletEntity?
    fun findByPatientsWherePatientIsActive(isActive: Boolean = true): List<PatientBraceletEntity?>
    fun findByPatient(patientId: Long): List<PatientBraceletEntity?>
    fun findByPatients(): List<PatientBraceletEntity?>
    fun findByBraceletsWherePatientIsActive(isActive: Boolean = true): List<PatientBraceletEntity?>
    fun findByBraceletsByColorWherePatientIsActive(color:String, isActive: Boolean = true): List<PatientBraceletEntity?>
    fun findByBraceletsWherePatientIsActiveOrderByPriorityAndCreatedAt(color:String, isActive: Boolean = true): List<PatientBraceletEntity?>
}