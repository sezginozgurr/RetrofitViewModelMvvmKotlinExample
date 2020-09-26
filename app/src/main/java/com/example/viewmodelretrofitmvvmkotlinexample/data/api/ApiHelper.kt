package com.example.viewmodelretrofitmvvmkotlinexample.data.api

class ApiHelper(private val apiService: ApiService) {

    fun getUsers() = apiService.getUsers()

}