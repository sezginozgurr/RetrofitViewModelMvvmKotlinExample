package com.example.viewmodelretrofitmvvmkotlinexample.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelretrofitmvvmkotlinexample.data.api.ApiHelper
import com.example.viewmodelretrofitmvvmkotlinexample.data.reporsitory.MainRepository
import com.example.viewmodelretrofitmvvmkotlinexample.ui.main.viewmodel.MainViewModel

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}