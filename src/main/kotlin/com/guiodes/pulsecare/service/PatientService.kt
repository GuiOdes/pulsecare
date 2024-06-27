package com.guiodes.pulsecare.service

import com.guiodes.pulsecare.domain.model.PatientHistoryModel
import com.guiodes.pulsecare.domain.model.PatientModel
import com.guiodes.pulsecare.repository.BraceletRepository
import com.guiodes.pulsecare.repository.PatientHistoryRepository
import com.guiodes.pulsecare.repository.PatientRepository

class PatientService(
    private val patientRepository: PatientRepository,
    private val braceletRepository: BraceletRepository,
    private val historyRepository: PatientHistoryRepository
): BaseService<PatientModel>(patientRepository) {

    fun createBracelet(patientId: Long, braceletColor: String) {
        TODO()
    }

    fun createHistory(patientId: Long, historyModel: PatientHistoryModel) {
        TODO()
    }

    fun getByParam(param: String): PatientModel {
        TODO()
    }
}
