package com.guiodes.pulsecare.repository.impl

import com.guiodes.pulsecare.domain.entity.BaseEntity
import com.guiodes.pulsecare.repository.BaseRepository
import org.springframework.data.jpa.repository.JpaRepository

abstract class BaseRepositoryImpl<T: BaseEntity>(
    private val dataRepository: JpaRepository<T, Long>
): BaseRepository<T> {

    override fun saveOrUpdate(t: T): T {
        return dataRepository.save(t)
    }

    override fun findById(id: Long): T {
        return dataRepository.findById(id).orElseThrow { RuntimeException("Not found") }
    }

    override fun findAll(): List<T> {
        return dataRepository.findAll()
    }

    override fun delete(id: Long) {
        dataRepository.deleteById(id)
    }
}