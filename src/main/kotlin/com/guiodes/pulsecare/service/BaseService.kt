package com.guiodes.pulsecare.service

import com.guiodes.pulsecare.repository.BaseRepository
import org.springframework.stereotype.Service

@Service
abstract class BaseService<T>(
    private val repository: BaseRepository<T>
) {
    fun saveOrUpdate(t: T) = repository.saveOrUpdate(t)
    fun findById(id: Long) = repository.findById(id)
    fun findAll(): List<T> = repository.findAll()
    fun delete(id: Int) = repository.delete(id)
}
