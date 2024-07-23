package com.guiodes.pulsecare.service

import com.guiodes.pulsecare.api.request.CreateEmployeeRequest
import com.guiodes.pulsecare.domain.entity.EmployeeEntity
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
        val employe = findByDocument(employeeModel.document)
        employe.copy(
             name = employeeModel.name,
             phone = employeeModel.phone,
             email = employeeModel.email,
             birthDate = employeeModel.birthDate,
             type = employeeModel.type
        )
        return employeeRepository.saveOrUpdateEmployee(employe)
    }

    fun findAll(): List<EmployeeEntity> {
        return employeeRepository.findAll()
    }
}
