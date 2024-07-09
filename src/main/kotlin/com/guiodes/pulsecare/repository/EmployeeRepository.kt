package com.guiodes.pulsecare.repository

import com.guiodes.pulsecare.domain.model.EmployeeModel

interface EmployeeRepository: BaseRepository<EmployeeModel> {
    fun findByDocument(document: String): EmployeeModel?
    fun existsByDocument(document: String): Boolean
}