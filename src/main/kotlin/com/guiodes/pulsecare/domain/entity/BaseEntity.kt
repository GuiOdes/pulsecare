package com.guiodes.pulsecare.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDateTime

@Entity
open class BaseEntity(
    @Id
    @GeneratedValue
    open val id: Long? = null,

    @CreationTimestamp
    open val createdAt: LocalDateTime? = null
)
