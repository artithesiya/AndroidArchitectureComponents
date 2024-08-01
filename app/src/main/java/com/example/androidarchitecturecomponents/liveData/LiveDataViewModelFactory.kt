package com.example.androidarchitecturecomponents.liveData

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class LiveDataViewModelFactory(val initialValue: Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return LiveDataViewModel(initialValue) as T
    }

}