package com.guiodes.pulsecare.repository.data

import com.guiodes.pulsecare.domain.entity.PatientBraceletEntity
import com.guiodes.pulsecare.domain.model.PatientBraceletModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface PatientBraceletJpaRepository:JpaRepository<PatientBraceletEntity, Long> {
    @Query(
        "SELECT pbe FROM PatientBraceletEntity pbe " +
        "WHERE pbe.isActive = :active " +
        "ORDER BY pbe.bracelet.priority, pbe.createdAt DESC"
    )
    fun findAll(active: Boolean): List<PatientBraceletEntity>
}
