package com.example.viewmodelretrofitmvvmkotlinexample.data.reporsitory

import com.example.viewmodelretrofitmvvmkotlinexample.data.api.ApiHelper
import io.reactivex.Single
import com.example.viewmodelretrofitmvvmkotlinexample.data.model.User

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }

}