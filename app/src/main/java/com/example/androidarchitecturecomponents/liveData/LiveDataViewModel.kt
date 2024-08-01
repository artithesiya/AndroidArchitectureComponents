package com.example.androidarchitecturecomponents.liveData

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataViewModel(initialValue: Int?) : ViewModel() {
    private val counterLiveData = MutableLiveData<Int>(initialValue)
    val counter: LiveData<Int>
        get() = counterLiveData

    fun increment() {
        counterLiveData.value = counterLiveData.value.toString().toInt() + 1
    }
}