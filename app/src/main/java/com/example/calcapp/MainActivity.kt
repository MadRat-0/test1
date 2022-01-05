package com.example.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val goToHome = findViewById<Button>(R.id.goToHome)
        val name = findViewById<EditText>(R.id.name)
        goToHome.setOnClickListener{
            val namevalue = name.text.toString()
            val intent = Intent(this,HomeActivity::class.java)
            intent.putExtra("username", namevalue)
            startActivity(intent)
        }
    }
}