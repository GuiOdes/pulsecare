package com.guiodes.pulsecare.service

import com.guiodes.pulsecare.domain.model.EmployeeModel
import com.guiodes.pulsecare.repository.EmployeeRepository
import org.springframework.stereotype.Service

@Service
class EmployeeService(
    private val employeeRepository: EmployeeRepository
): BaseService<EmployeeModel>(employeeRepository) {

    fun findByDocument(document: String): EmployeeModel {
        return employeeRepository.findByDocument(document) ?: throw Exception("Employee not found")
    }

    fun existsByDocument(document: String): Boolean {
        return employeeRepository.existsByDocument(document)
    }
}
