package com.example.timerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.TextView


private var seconds : Int = 0
private var isRunning : Boolean = false

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState != null)
        {
            seconds = savedInstanceState.getInt(seconds.javaClass.name)
            isRunning = savedInstanceState.getBoolean(isRunning.javaClass.name)
        }

        runTimer()
    }

    override fun onSaveInstanceState(savedInstanceState: Bundle){
        super.onSaveInstanceState(savedInstanceState)
        savedInstanceState.putInt(seconds.javaClass.name, seconds)
        savedInstanceState.putBoolean(isRunning.javaClass.name, isRunning)
    }

    fun onClickStart(view: View) {
        isRunning = true
    }
    fun onClickStop(view: View) {
        isRunning = false
    }
    fun onClickReset(view: View) {
        isRunning = false
        seconds = 0
    }

    private fun runTimer(){
        val textView = findViewById<TextView>(R.id.text_view)
        val handler = Handler()
        handler.post(object:Runnable{
            override fun run(){
                val hours = seconds / 3600
                val minutes = (seconds%3600) / 60
                val secs = seconds % 60
                val time = String.format("%d: %02d, %02d", hours, minutes, secs)
                textView.text = time
                if(isRunning){
                    seconds++
                }
                handler.postDelayed(this,1000)
            }
        })
    }
}