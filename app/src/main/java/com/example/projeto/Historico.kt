package com.example.projeto

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Historico : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historico) // Certifique-se que este layout existe

        // Inicializando o ImageButton
        val imageButton: ImageButton = findViewById(R.id.imageButton)

        // Definindo ação de clique no ImageButton
        imageButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}
