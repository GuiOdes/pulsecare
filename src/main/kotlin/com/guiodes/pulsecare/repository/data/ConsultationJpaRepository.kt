package com.guiodes.pulsecare.repository.data

import com.guiodes.pulsecare.domain.model.ConsultationModel
import com.guiodes.pulsecare.entities.ConsultationEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDateTime

interface ConsultationJpaRepository: JpaRepository<ConsultationModel, Long>{
    fun findByDoctor(doctorID: Long): List<ConsultationEntity>
    fun findByDate(dateTime: LocalDateTime): List<ConsultationEntity>
}