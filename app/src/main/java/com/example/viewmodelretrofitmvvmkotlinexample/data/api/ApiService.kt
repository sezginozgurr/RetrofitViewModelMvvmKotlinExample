package com.example.viewmodelretrofitmvvmkotlinexample.data.api

import com.example.viewmodelretrofitmvvmkotlinexample.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers(): Single<List<User>>

}