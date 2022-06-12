package com.example.gmpindustriais

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class DescricaoDisperssores : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_descricao_disperssores)

        val btndisperssores = findViewById<AppCompatButton>(R.id.btndisperssores)
        btndisperssores.setOnClickListener {
            val intent = Intent(this, DisperssoresActivity3::class.java)
            startActivity(intent)
        }
    }
}