package com.example.domain

interface HhRepository {
    suspend fun getAll() : Array<String>
}