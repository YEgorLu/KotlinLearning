package com.example.callintentapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonMail()
        buttonCall()
        buttonMap()
        buttonWeb()
    }

    private fun buttonWeb() {
        val button = findViewById<Button>(R.id.button_web)
        button.setOnClickListener {
                val webPage = Uri.parse("http://vk.com")
                val intent = Intent(Intent.ACTION_VIEW, webPage)

                if(isIntentSafe(intent))
                    startActivity(intent)
                else
                    Toast.makeText(applicationContext, "Your phone have no app for web", Toast.LENGTH_SHORT).show()
        }
    }

    private fun buttonMap() {
        val button = findViewById<Button>(R.id.button_map)
        button.setOnClickListener {
                val location: Uri = Uri.parse("geo: 37.422219, -122.08364?z=14")
                val intent = Intent(Intent.ACTION_VIEW, location)

                if(isIntentSafe(intent))
                    startActivity(intent)
                else
                    Toast.makeText(applicationContext, "Your phone have no app for mapping", Toast.LENGTH_SHORT).show()
        }
    }

    private fun buttonCall() {
        val button = findViewById<Button>(R.id.button_call)
        button.setOnClickListener {
                val number: Uri = Uri.parse("tel: ")
                val intent = Intent(Intent.ACTION_DIAL, number)

                if(isIntentSafe(intent))
                    startActivity(intent)
                else
                    Toast.makeText(applicationContext, "Your phone have no app for dial", Toast.LENGTH_SHORT).show()
        }
    }

    private fun buttonMail() {
        val button = findViewById<Button>(R.id.button_mail)
        button.setOnClickListener {
                val intent =
                    Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "example@gmail.com", null))
                intent.putExtra(Intent.EXTRA_EMAIL, "hello@mail.ru, hi@,ail.ru")
                intent.putExtra(Intent.EXTRA_SUBJECT, "Send intent message")
                intent.putExtra(Intent.EXTRA_TEXT, "I text this text via android app")

                if(isIntentSafe(intent))
                    startActivity(intent)
                else
                    Toast.makeText(applicationContext, "Your phone have no app for mailing", Toast.LENGTH_SHORT).show()
        }
    }

    private fun isIntentSafe(intent: Intent): Boolean {
        val packageManager = packageManager
        val activities = packageManager.queryIntentActivities(intent, 0)
        return activities.size > 0
    }
}