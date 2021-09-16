package com.example.aula2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TelaMostrar : AppCompatActivity() {

    lateinit var tvNome: TextView
    lateinit var tvEmail: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_mostrar)

        tvNome = findViewById(R.id.txtVNomeTela2)
        tvEmail = findViewById(R.id.txtVEmailTela2)

        val extras: Bundle? = intent.extras

        tvNome.text = extras?.getString("nome")
        tvEmail.text = extras?.getString("email")

    }
}