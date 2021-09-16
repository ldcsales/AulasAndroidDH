package com.example.aula1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        Log.w("Lifecycle", "On Create: estou criando a tela")

        buttonStart.setOnClickListener(){
            start()
        }

    }

    override fun onStart() {
        super.onStart()
        Log.w("Lifecycle", "On Start: deixei a tela visível para você")
        val toast = Toast.makeText(this ,"On Start", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.w("Lifecycle", "On Resume: agora você pode interagir com a tela")
        val toast = Toast.makeText(this ,"On Resume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.w("Lifecycle", "On Pause: a tela perdeu o foco, você não pode mais interagir com ela")
        val toast = Toast.makeText(this ,"On Pause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        Log.w("Lifecycle", "On Stop: a tela não está mais visível, mas ainda existe")
        val toast = Toast.makeText(this ,"On Stop", Toast.LENGTH_SHORT).show()
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("Lifecycle", "On Restart: a tela está retomando o foco")
        val toast = Toast.makeText(this ,"On Restart", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        Log.w("Lifecycle", "On Destroy: a tela foi destruída :(")
        val toast = Toast.makeText(this ,"On Destroy", Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }

    fun start() {
        var intent = Intent(this, ActivityA::class.java)
        startActivity(intent)

    }

}