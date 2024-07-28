package com.guiodes.pulsecare.repository

import org.springframework.stereotype.Repository

@Repository
interface BaseRepository<T> {
    fun saveOrUpdate(t: T): T
    fun findById(id: Long): T?
    fun findAll(): List<T>
    fun delete(id: Long)
}