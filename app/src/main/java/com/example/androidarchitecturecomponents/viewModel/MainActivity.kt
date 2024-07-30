package com.example.androidarchitecturecomponents.viewModel

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.lifecycle.ViewModelProvider
import com.example.androidarchitecturecomponents.R

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actiivity_main)
        val txtCounter = findViewById<TextView>(R.id.txtCounter)
        val btnIncrement = findViewById<TextView>(R.id.btnIncrement)
        val counterViewModelFactory = CounterViewModelFactory(10)
        val viewModel = ViewModelProvider.create(
            this@MainActivity,
            counterViewModelFactory
        )[CounterViewModel::class.java]
        txtCounter.text = viewModel.counter.toString()
        btnIncrement.setOnClickListener {
            viewModel.increment()
            txtCounter.text = viewModel.counter.toString()
        }

    }
}