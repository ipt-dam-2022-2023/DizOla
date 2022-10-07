package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_MESSAGE = "MESSAGE1"
const val TXT_VALUE = "TXT_VALUE"


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun dizOla(view: View) {
        Log.d("Atenção:", "Vou dizer Olá")
        val txtOla: TextView = findViewById(R.id.txtOla)
        txtOla.text = "Ola Mundo"
    }

    fun muda(view: View) {

        val message = "Uma mensagem :-) "
        val intent = Intent(this, OtherActivity::class.java)
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent)

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("Atenção:", "Vou Salvar")
        val txtOla: TextView = findViewById(R.id.txtOla)
        outState.putString(TXT_VALUE, txtOla.text as String?)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("Atenção:", "Vou recuperar")
        val txtOla: TextView = findViewById(R.id.txtOla)
        txtOla.text = savedInstanceState.getString(TXT_VALUE)
    }




}