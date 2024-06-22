package com.guiodes.pulsecare.repository

interface BaseRepository<T> {
    fun saveOrUpdate(t: T): T
    fun findById(id: Long): T
    fun findAll(): List<T>
    fun delete(id: Int)
}