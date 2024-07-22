package com.guiodes.pulsecare.api.controller

import com.guiodes.pulsecare.service.ProntuaryService
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/prontuary")
class ProntuaryController(
    private val prontuaryService: ProntuaryService
) {

    @PutMapping("/next")
    fun callNextPatient() = prontuaryService.callNextPatient()
}