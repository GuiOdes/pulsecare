package com.guiodes.pulsecare.repository

import com.guiodes.pulsecare.domain.entity.EmployeeEntity

interface EmployeeRepository: BaseRepository<EmployeeEntity> {
    fun findByDocument(document: String): EmployeeEntity?
    fun existsByDocument(document: String): Boolean
}