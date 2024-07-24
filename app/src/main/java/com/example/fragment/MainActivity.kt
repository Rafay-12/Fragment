package com.example.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    private lateinit var button1: Button
    private lateinit var button2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initUi()
        eventHandler()
    }

    private fun initUi(){
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
    }

    private fun replaceFragment(fragment : Fragment){
        val manager = supportFragmentManager
        var tr = manager.beginTransaction()
        tr.replace(R.id.fragmentContainerView,fragment)
        tr.commit()
    }

    @SuppressLint("CommitTransaction")
    private fun eventHandler(){
        button1.setOnClickListener{
            replaceFragment(Fragment1())
        }
        button2.setOnClickListener{
            replaceFragment(Fragment2())
        }
    }
}