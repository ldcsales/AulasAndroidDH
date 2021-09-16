package com.example.aula2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Login : AppCompatActivity() {

    lateinit var btnLogin: Button
    lateinit var txtVNome: TextView
    lateinit var txtVEmail: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        txtVEmail = findViewById(R.id.txtVEmail)
        txtVNome = findViewById(R.id.txtVNome)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {

            var intent = Intent(this, TelaMostrar::class.java)
            intent.putExtra("nome", txtVNome.text.toString())
            intent.putExtra("email", txtVEmail.text.toString())
            startActivity(intent)

        }


    }
}