package com.guiodes.pulsecare.repository.data

import com.guiodes.pulsecare.domain.model.EmployeeModel
import org.springframework.data.jpa.repository.JpaRepository

interface EmployeeJpaRepository:JpaRepository<EmployeeModel, Long>