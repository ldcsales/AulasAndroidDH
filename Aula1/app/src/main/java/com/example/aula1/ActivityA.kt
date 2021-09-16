package com.example.aula1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_a.*
import kotlinx.android.synthetic.main.main_activity.*

class ActivityA: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        Log.w("Lifecycle", "On Create: estou criando a tela")

        buttonA.setOnClickListener(){
            goB()
        }

    }


    fun goB() {
        var intent = Intent(this, ActivityB::class.java)
        startActivity(intent)

    }

}