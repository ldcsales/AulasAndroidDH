package com.example.aula1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_b.*
import kotlinx.android.synthetic.main.main_activity.*

class ActivityB: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        Log.w("Lifecycle", "On Create: estou criando a tela")

        buttonB.setOnClickListener(){
            goA()
        }

    }


    fun goA() {
        var intent = Intent(this, ActivityA::class.java)
        startActivity(intent)

    }

}