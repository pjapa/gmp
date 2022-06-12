package com.example.gmpindustriais

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class DescricaoHelices : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_descricao_helices)
        val btnhelices = findViewById<AppCompatButton>(R.id.btnhelices)
        btnhelices.setOnClickListener {
            val intent = Intent(this, HelicesActivity2::class.java)

            startActivity(intent)
        }
    }
}