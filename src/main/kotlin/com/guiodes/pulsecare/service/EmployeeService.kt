package com.guiodes.pulsecare.service

import com.guiodes.pulsecare.api.request.CreateEmployeeRequest
import com.guiodes.pulsecare.domain.model.EmployeeModel
import com.guiodes.pulsecare.repository.EmployeeRepository
import org.springframework.stereotype.Service

@Service
class EmployeeService(
    private val employeeRepository: EmployeeRepository
) {

    fun findByDocument(document: String): EmployeeModel {
        return employeeRepository.findByDocument(document)?.toModel()
            ?: throw Exception("Employee not found")
    }

    fun existsByDocument(document: String): Boolean {
        return employeeRepository.existsByDocument(document)
    }

    fun saveOrUpdate(employeeModel: CreateEmployeeRequest): EmployeeModel {
        TODO("Not yet implemented")
    }

    fun findAll(): List<EmployeeModel> {
        TODO("Not yet implemented")
    }
}
