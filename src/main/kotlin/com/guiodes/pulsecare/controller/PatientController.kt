package com.guiodes.pulsecare.controller

import com.guiodes.pulsecare.domain.model.PatientHistoryModel
import com.guiodes.pulsecare.domain.model.PatientModel
import com.guiodes.pulsecare.service.PatientService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/patient")
class PatientController(
    private val patientService: PatientService
) {

    @PostMapping
    fun save(
        patientModel: PatientModel
    ) = patientService.saveOrUpdate(patientModel)

    @PostMapping("/bracelet")
    fun createBracelet(
        patientId: Long,
        braceletColor: String
    ) = patientService.createBracelet(patientId, braceletColor)

    @PostMapping("/history")
    fun createHistory(
        patientId: Long,
        historyModel: PatientHistoryModel
    ) = patientService.createHistory(patientId, historyModel)

    @GetMapping
    fun findAll() = patientService.findAll()

    @GetMapping("/{id}")
    fun findById(
        @PathVariable id: Long
    ) = patientService.findById(id)

    @DeleteMapping
    fun delete(
        patientModel: PatientModel
    ) = patientService.delete(patientModel)
}
