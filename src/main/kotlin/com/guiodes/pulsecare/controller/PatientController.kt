package com.guiodes.pulsecare.controller

import com.guiodes.pulsecare.domain.model.ConsultationModel
import com.guiodes.pulsecare.domain.model.PatientHistoryModel
import com.guiodes.pulsecare.domain.model.PatientModel
import com.guiodes.pulsecare.domain.model.ProntuaryModel
import com.guiodes.pulsecare.service.ConsultationService
import com.guiodes.pulsecare.service.PatientService
import com.guiodes.pulsecare.service.ProntuaryService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/patient")
class PatientController(
    private val patientService: PatientService,
    private val prontuaryService: ProntuaryService,
    private val consultationService: ConsultationService
) {

    @PostMapping
    fun saveOrUpdate(patientModel: PatientModel): PatientModel {
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

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): PatientModel {
        return patientService.findById(id)
    }

    @PostMapping("/prontuary")
    fun saveProntuary(@RequestBody prontuaryModel: ProntuaryModel): ProntuaryModel {
        return prontuaryService.saveOrUpdate(prontuaryModel)
    }

    @PostMapping("/consultation")
    fun saveConsultation(@RequestBody consultationModel: ConsultationModel): ConsultationModel {
        return consultationService.saveOrUpdate(consultationModel)
    }
}
