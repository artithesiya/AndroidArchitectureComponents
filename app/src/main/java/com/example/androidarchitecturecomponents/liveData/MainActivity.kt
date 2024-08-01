package com.example.androidarchitecturecomponents.liveData

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.androidarchitecturecomponents.R

class MainActivity : ComponentActivity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actiivity_main)
        val liveDataViewModelFactory = LiveDataViewModelFactory(10)
        val counterViewModel = ViewModelProvider.create(this, liveDataViewModelFactory)
            .get(LiveDataViewModel::class.java)
        findViewById<Button>(R.id.btnIncrement).setOnClickListener {
            counterViewModel.increment()
        }
        counterViewModel.counter.observe(this, Observer {
            findViewById<TextView>(R.id.txtCounter).text =
                it.toString()
        })
    }
}