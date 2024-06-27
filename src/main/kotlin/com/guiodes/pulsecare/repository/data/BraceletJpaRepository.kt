package com.guiodes.pulsecare.repository.data

import com.guiodes.pulsecare.domain.model.BraceletModel
import org.springframework.data.jpa.repository.JpaRepository

interface BraceletJpaRepository:JpaRepository<BraceletModel, Long>