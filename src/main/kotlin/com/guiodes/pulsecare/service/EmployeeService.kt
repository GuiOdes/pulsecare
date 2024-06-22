package com.guiodes.pulsecare.service

import com.guiodes.pulsecare.domain.model.EmployeeModel
import com.guiodes.pulsecare.repository.EmployeeRepository

class EmployeeService(
    private val employeeRepository: EmployeeRepository
): BaseService<EmployeeModel>(employeeRepository)
