package com.guiodes.pulsecare.repository.data

import com.guiodes.pulsecare.domain.enum.EmployeeType
import com.guiodes.pulsecare.domain.model.EmployeeModel
import com.guiodes.pulsecare.entities.EmployeeEntity
import org.springframework.data.jpa.repository.JpaRepository

interface EmployeeJpaRepository:JpaRepository<EmployeeModel, Long>{
    fun findByDocument(employeeDocumentRequest: String):EmployeeEntity?
    fun findByName(name:String):EmployeeEntity?
    fun findByType(type: EmployeeType): List<EmployeeEntity?>
}