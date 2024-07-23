package com.guiodes.pulsecare.service

import com.guiodes.pulsecare.api.request.CreatePatientRequest
import com.guiodes.pulsecare.api.request.PatientHistoryRequest
import com.guiodes.pulsecare.domain.model.BraceletModel
import com.guiodes.pulsecare.domain.model.PatientHistoryModel
import com.guiodes.pulsecare.domain.model.PatientModel
import com.guiodes.pulsecare.repository.BraceletRepository
import com.guiodes.pulsecare.repository.PatientHistoryRepository
import com.guiodes.pulsecare.repository.PatientRepository
import org.springframework.stereotype.Service

@Service
class PatientService(
    private val patientRepository: PatientRepository,
    private val braceletRepository: BraceletRepository,
    private val historyRepository: PatientHistoryRepository
) {

    fun createBracelet(patientId: Long, braceletColor: String): BraceletModel {
        val braceletModel:BraceletModel
        braceletModel.copy(
            color = braceletColor
        )

       return braceletRepository.saveOrUpdate(braceletModel).toModel()
    }

    fun createHistory(patientId: Long, request: PatientHistoryRequest) {

    }

    fun getByParam(param: String): PatientModel {
        TODO()
    }

    fun getProntuaryQueue(): List<PatientModel> {
        TODO()
    }

    fun getConsultationQueue(): List<PatientModel> {
        TODO()
    }

    fun findAllQueues(): Pair<List<PatientModel>, List<PatientModel>> {
        TODO()
    }

    fun saveOrUpdate(request: CreatePatientRequest): PatientModel {
        TODO("Not yet implemented")
    }

    fun findAll(): List<PatientModel> {
        TODO("Not yet implemented")
    }

    fun findById(id: Long): PatientModel {
        TODO("Not yet implemented")
    }
}
