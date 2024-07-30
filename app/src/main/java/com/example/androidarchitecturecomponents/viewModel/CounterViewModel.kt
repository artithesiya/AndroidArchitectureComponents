package com.example.androidarchitecturecomponents.viewModel

import androidx.lifecycle.ViewModel

class CounterViewModel(var counter: Int) : ViewModel() {

//    init {
//        this.counter++
//    }

    fun increment(): Int {
        counter++
        return counter
    }
}