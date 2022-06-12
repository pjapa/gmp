package com.example.gmpindustriais

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class DescricaoAditivos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_descricao_aditivos)
        val btnestacao = findViewById<AppCompatButton>(R.id.btnestacao)
        btnestacao.setOnClickListener {
            val intent = Intent(this, AditivosActivity2::class.java)

            startActivity(intent)
        }
    }
}