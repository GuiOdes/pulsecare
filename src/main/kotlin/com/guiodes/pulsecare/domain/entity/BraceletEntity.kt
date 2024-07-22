package com.guiodes.pulsecare.domain.entity

import com.guiodes.pulsecare.domain.model.BraceletModel
import jakarta.persistence.Entity

@Entity
class BraceletEntity(
    val color: String,
    val priority: Int
): BaseEntity() {

    fun toModel() = BraceletModel(
        id = id,
        color = color,
        priority = priority,
        createdAt = createdAt
    )
}