package com.guiodes.pulsecare.repository.impl

import com.guiodes.pulsecare.domain.entity.EmployeeEntity
import com.guiodes.pulsecare.domain.model.EmployeeModel
import com.guiodes.pulsecare.repository.EmployeeRepository
import com.guiodes.pulsecare.repository.data.EmployeeJpaRepository
import org.springframework.stereotype.Repository

@Repository
class EmployeeRepositoryImpl(
    private val repository: EmployeeJpaRepository
): EmployeeRepository, BaseRepositoryImpl<EmployeeModel>(repository) {
    override fun findByDocument(document: String) = repository.findByDocument(document)

    override fun existsByDocument(document: String) = repository.existsByDocument(document)
}