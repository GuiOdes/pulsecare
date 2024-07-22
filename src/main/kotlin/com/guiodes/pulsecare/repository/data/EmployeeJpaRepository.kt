package com.guiodes.pulsecare.repository.data

import com.guiodes.pulsecare.domain.entity.EmployeeEntity
import com.guiodes.pulsecare.domain.model.EmployeeModel
import org.springframework.data.jpa.repository.JpaRepository

interface EmployeeJpaRepository:JpaRepository<EmployeeEntity, Long> {
    fun findByDocument(document: String): EmployeeEntity?
    fun existsByDocument(document: String): Boolean
}