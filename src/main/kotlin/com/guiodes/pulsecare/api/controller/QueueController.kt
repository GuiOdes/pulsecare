package com.guiodes.pulsecare.api.controller

import com.guiodes.pulsecare.service.ConsultationService
import com.guiodes.pulsecare.service.PatientService
import com.guiodes.pulsecare.service.ProntuaryService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/queue")
class QueueController (
    private val patientService: PatientService,
    private val prontuaryService: ProntuaryService,
    private val consultationService: ConsultationService
) {

    @GetMapping("/prontuary")
    fun getProntuaryQueue() = patientService.getProntuaryQueue()

    @GetMapping("/consultation")
    fun getConsultationQueue() = patientService.getConsultationQueue()

    @GetMapping("/all")
    fun findAll() = patientService.findAllQueues()
}