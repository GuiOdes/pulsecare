package com.guiodes.pulsecare.controller

import com.guiodes.pulsecare.domain.model.EmployeeModel
import com.guiodes.pulsecare.service.EmployeeService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/employee")
class EmployeeController (
    private val employeeService: EmployeeService
) {

    @PostMapping
    fun save(employeeModel: EmployeeModel): EmployeeModel {
        return employeeService.saveOrUpdate(employeeModel)
    }

    @GetMapping("/all")
    fun findAll() = employeeService.findAll()

    @GetMapping("/login/{document}")
    fun findByDocument(@PathVariable document: String): EmployeeModel {
        return employeeService.findByDocument(document)
    }


}