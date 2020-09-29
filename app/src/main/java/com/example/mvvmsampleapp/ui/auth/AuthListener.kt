package com.example.mvvmsampleapp.ui.auth

import androidx.lifecycle.LiveData
import com.example.mvvmsampleapp.data.db.entities.User

interface AuthListener {

    fun onStarted()
    //fun onSuccess(loginResponse: LiveData<String>)
    fun onSuccess(user: User) //for coroutines method in AuthViewModel
    fun onFailure(message: String)

}