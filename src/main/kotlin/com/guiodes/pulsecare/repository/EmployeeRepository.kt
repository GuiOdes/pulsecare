package com.guiodes.pulsecare.repository

import com.guiodes.pulsecare.domain.entity.EmployeeEntity
import com.guiodes.pulsecare.domain.model.EmployeeModel

interface EmployeeRepository: BaseRepository<EmployeeEntity> {
    fun findByDocument(document: String): EmployeeEntity?
    fun existsByDocument(document: String): Boolean
    fun saveOrUpdateEmployee(employee: EmployeeModel): EmployeeModel
}