package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)


        val message = intent.getStringExtra(EXTRA_MESSAGE)


        val textView: TextView = findViewById(R.id.txtMensagem);
        textView.text = message

    }

    fun dizOla(view: View) {}


}