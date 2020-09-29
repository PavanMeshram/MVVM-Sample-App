package com.example.mvvmsampleapp.data.network.responses

import com.example.mvvmsampleapp.data.db.entities.User

data class AuthResponse(
    val isSuccessful: Boolean?,
    val message: String?,
    val user: User?
)