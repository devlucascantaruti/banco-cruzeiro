package com.example.projeto

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class MainActivity2 : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val buttonHistorico: AppCompatButton = findViewById(R.id.buttonHistorico)


        buttonHistorico.setOnClickListener {
            val intent = Intent(this, Historico::class.java)
            startActivity(intent)
        }
    }
}
