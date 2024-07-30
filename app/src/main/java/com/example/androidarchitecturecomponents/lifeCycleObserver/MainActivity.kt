package com.example.androidarchitecturecomponents.lifeCycleObserver

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.ComponentActivity
import com.example.androidarchitecturecomponents.R

class MainActivity : ComponentActivity() {
    private val lifeCycle: LifeCycle = LifeCycle()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actiivity_main)
        Log.d("MainActivity_LifeCycle", "onCreate: ")
        lifeCycle.onCreate()
        findViewById<Button>(R.id.btnNext).setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity_LifeCycle", "onStart: ")
        lifeCycle.onStart()
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity_LifeCycle", "onResume: ")
        lifeCycle.onResume()
    }

    override fun onPause() {
        Log.d("MainActivity_LifeCycle", "onPause: ")
        lifeCycle.onPause()
        super.onPause()
    }

    override fun onStop() {
        Log.d("MainActivity_LifeCycle", "onStop: ")
        lifeCycle.onStop()
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("MainActivity_LifeCycle", "onDestroy: ")
        lifeCycle.onDestroy()
        super.onDestroy()

    }
}
