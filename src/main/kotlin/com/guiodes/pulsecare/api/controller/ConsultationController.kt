package com.guiodes.pulsecare.api.controller

import com.guiodes.pulsecare.api.request.CreateConsultationRequest
import com.guiodes.pulsecare.domain.model.ConsultationModel
import com.guiodes.pulsecare.service.ConsultationService
import org.springframework.web.bind.annotation.PathVariable
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
        @RequestBody request: CreateConsultationRequest
    ) = consultationService.saveOrUpdate(request)

    @PutMapping("/finish/{consultationId}")
    fun finishConsultation(
        @PathVariable consultationId: Long
    ) = consultationService.finishConsultation(consultationId)
}