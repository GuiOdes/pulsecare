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
    fun savePatient(patientModel: PatientModel): PatientModel {
        return patientService.saveOrUpdate(patientModel)
    }

    @PostMapping("/{patientId}/bracelet")
    fun attachBracelet(@PathVariable patientId: Long, braceletColor: String) {
        patientService.createBracelet(patientId, braceletColor)
    }

    @PostMapping("/{patientId}/history")
    fun createHistory(@PathVariable patientId: Long, historyModel: PatientHistoryModel) {
        patientService.createHistory(patientId, historyModel)
    }

    @GetMapping
    fun findAll() = patientService.findAll()

    @GetMapping("/{param}")
    fun getByParam(@PathVariable param: String): PatientModel {
        return patientService.getByParam(param)
    }
}
