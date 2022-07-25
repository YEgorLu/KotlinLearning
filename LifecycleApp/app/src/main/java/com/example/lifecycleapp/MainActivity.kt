package com.example.lifecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast

private const val TAG = "LifeCycle"
private lateinit var infoLog : TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        infoLog = findViewById(R.id.textView)
        Toast.makeText(applicationContext, "onCreate", Toast.LENGTH_LONG).show()
        Log.i(TAG, "onCreate")
    }

    override fun onStart(){
        super.onStart()
        Toast.makeText(applicationContext, "onStart", Toast.LENGTH_LONG).show()
        Log.i(TAG, "onStart")
    }

    override fun onResume(){
        super.onResume()
        Toast.makeText(applicationContext, "onResume", Toast.LENGTH_LONG).show()
        Log.i(TAG, "onResume")
    }

    override fun onPause(){
        super.onPause()
        Toast.makeText(applicationContext, "onPause", Toast.LENGTH_LONG).show()
        Log.i(TAG, "onPause")
    }

    override fun onStop(){
        super.onStop()
        Toast.makeText(applicationContext, "onStop", Toast.LENGTH_LONG).show()
        Log.i(TAG, "onStop")
    }

    override fun onRestart(){
        super.onRestart()
        Toast.makeText(applicationContext, "onRestart", Toast.LENGTH_LONG).show()
        Log.i(TAG, "onRestart")
    }

    override fun onDestroy(){
        super.onDestroy()
        Toast.makeText(applicationContext, "onDestroy", Toast.LENGTH_LONG).show()
        Log.i(TAG, "onDestroy")
    }

    fun onClick(view: View) {
        when(view.id) {
            R.id.button_click -> infoLog.text = "Приложение уже было запущенно"
            R.id.exitApp -> finish()
        }
    }
}