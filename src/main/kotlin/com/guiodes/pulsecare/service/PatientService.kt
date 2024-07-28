package com.guiodes.pulsecare.service

import com.guiodes.pulsecare.api.request.CreatePatientBraceletRequest
import com.guiodes.pulsecare.api.request.CreatePatientRequest
import com.guiodes.pulsecare.api.request.PatientHistoryRequest
import com.guiodes.pulsecare.domain.entity.PatientBraceletEntity
import com.guiodes.pulsecare.domain.entity.PatientEntity
import com.guiodes.pulsecare.domain.entity.PatientHistoryEntity
import com.guiodes.pulsecare.domain.model.PatientBraceletModel
import com.guiodes.pulsecare.domain.model.PatientHistoryModel
import com.guiodes.pulsecare.domain.model.PatientModel
import com.guiodes.pulsecare.repository.BraceletRepository
import com.guiodes.pulsecare.repository.PatientBraceletRepository
import com.guiodes.pulsecare.repository.PatientHistoryRepository
import com.guiodes.pulsecare.repository.PatientRepository
import org.springframework.stereotype.Service

@Service
class PatientService(
    private val patientRepository: PatientRepository,
    private val patientBraceletRepository: PatientBraceletRepository,
    private val braceletRepository: BraceletRepository,
    private val historyRepository: PatientHistoryRepository
) {

    fun createBracelet(patientId: Long, request: CreatePatientBraceletRequest) = patientBraceletRepository.saveOrUpdate(
        patientBraceletRepository.saveOrUpdate(
            PatientBraceletEntity(
                patient = patientRepository.findById(patientId) ?: throw RuntimeException("Patient not found"),
                bracelet = braceletRepository.findByColor(request.braceletColor)
                    ?: throw RuntimeException("Bracelet not found"),
                complaint = request.complaint,
                true
            )
        )
    )

    fun createHistory(patientId: Long, request: PatientHistoryRequest): PatientHistoryEntity {
        val history = historyRepository.saveOrUpdate(
            PatientHistoryEntity(
                chronicallyDiseases = request.chronicallyDiseases,
                predisposedDiseases = request.predisposedDiseases
            )
        )

        patientRepository.saveOrUpdate(
            patientRepository.findById(patientId)!!.copy(
                medicalHistory = history
            )
        )

        return history
    }

    fun getByParam(param: String): PatientModel {
        return patientRepository.findByNameOrDocument(param)
    }

    fun getProntuaryQueue() = patientBraceletRepository.findAllWithoutProntuary().map { it.toModel() }

    fun getConsultationQueue() = patientBraceletRepository.findAllWithoutConsultation().map { it.toModel() }

    fun findAllQueues(): Pair<List<PatientBraceletModel>, List<PatientBraceletModel>> {
        return Pair(getProntuaryQueue(), getConsultationQueue())
    }

    fun saveOrUpdate(request: CreatePatientRequest) = patientRepository.saveOrUpdate(
        PatientEntity.of(request)
    ).toModel()

    fun findAll() = patientRepository.findAll().map { it.toModel() }

    fun findById(id: Long) = patientRepository.findById(id)?.toModel()
        ?: throw RuntimeException("Patient not found")
}
