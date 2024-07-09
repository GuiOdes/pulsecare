package com.guiodes.pulsecare.controller

import com.guiodes.pulsecare.domain.model.ConsultationModel
import com.guiodes.pulsecare.service.ConsultationService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/consultation")
class ConsultationController(
    private val consultationService: ConsultationService
) {
    @PutMapping("/next")
    fun callNextPatient() = consultationService.callNextPatient()

    @PostMapping("/register")
    fun registerConsultation(
        @RequestBody consultationModel: ConsultationModel
    ) = consultationService.saveOrUpdate(consultationModel)

    @PutMapping("/finish")
    fun finishConsultation(
        @RequestBody consultationModel: ConsultationModel
    ) = consultationService.finishConsultation(consultationModel)
}