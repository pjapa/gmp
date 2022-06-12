package com.example.gmpindustriais

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class DescricaoMoinhos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_descricao_moinhos)
        val btnmoinhos = findViewById<AppCompatButton>(R.id.btnmoinhos)
        btnmoinhos.setOnClickListener {
            val intent = Intent(this, MoinhosActivity2::class.java)

            startActivity(intent)
        }
    }
}