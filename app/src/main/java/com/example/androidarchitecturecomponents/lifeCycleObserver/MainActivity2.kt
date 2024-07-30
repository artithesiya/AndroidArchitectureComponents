package com.example.androidarchitecturecomponents.lifeCycleObserver

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import com.example.androidarchitecturecomponents.R

class MainActivity2 : ComponentActivity() {
    private val lifeCycle: LifeCycle = LifeCycle()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actiivity_main)
        Log.d("MainActivity2_LifeCycle", "onCreate: ")
        lifeCycle.onCreate()

    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity2_LifeCycle", "onStart: ")
        lifeCycle.onStart()
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity2_LifeCycle", "onResume: ")
        lifeCycle.onResume()
    }

    override fun onPause() {
        Log.d("MainActivity2_LifeCycle", "onPause: ")
        lifeCycle.onPause()
        super.onPause()
    }

    override fun onStop() {
        Log.d("MainActivity2_LifeCycle", "onStop: ")
        lifeCycle.onStop()
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("MainActivity2_LifeCycle", "onDestroy: ")
        lifeCycle.onDestroy()
        super.onDestroy()

    }
}
