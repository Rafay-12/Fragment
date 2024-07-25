package com.example.fragment

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActvitiy : AppCompatActivity() {
    private lateinit var name: TextView
    private var userName: String? = ""
    private var digit: Int? = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_actvitiy)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initUi()
        userName = intent.getStringExtra("testName")
        digit = intent.getIntExtra("testValue",0)

        Log.d("myTest","$userName & $digit")
    }

    private fun initUi(){
        name = findViewById(R.id.name_on_activity2)
        name.text = intent.getStringExtra("userName")
    }
}