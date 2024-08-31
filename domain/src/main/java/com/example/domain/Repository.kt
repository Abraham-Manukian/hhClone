package com.example.domain

interface Repository {
    suspend fun getAll() : Array<String>
}