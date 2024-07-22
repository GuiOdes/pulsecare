package com.guiodes.pulsecare.api.controller

import com.guiodes.pulsecare.api.request.CreateEmployeeRequest
import com.guiodes.pulsecare.domain.model.EmployeeModel
import com.guiodes.pulsecare.service.EmployeeService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/employee")
class EmployeeController (
    private val employeeService: EmployeeService
) {

    @PostMapping
    fun save(request: CreateEmployeeRequest): EmployeeModel {
        return employeeService.saveOrUpdate(request)
    }

    @GetMapping("/all")
    fun findAll() = employeeService.findAll()

    @GetMapping("/login/{document}")
    fun findByDocument(@PathVariable document: String): EmployeeModel {
        return employeeService.findByDocument(document)
    }
}